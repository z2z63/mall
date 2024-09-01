package com.example.mall;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;


import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class JwtUtil {
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expire}")
    private long expiration;
    @Value("${jwt.tokenHead}")
    private String BEARER;
    private static final String CLAIM_KEY_USERNAME = "sub";
    private static final String CLAIM_KEY_CREATED = "created";
    private SecretKey key;

    public JwtUtil() {
    }

    @PostConstruct
    public void postConstructor() {
        key = new SecretKeySpec(secret.getBytes(), "HMACSHA256");
    }

    private String generateToken(Map<String, Object> claims) {
        Date expire = new Date(System.currentTimeMillis() + expiration * 1000);
        return Jwts.builder().claims(claims).expiration(expire).signWith(key).compact();
    }

    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME, userDetails.getUsername());
        claims.put(CLAIM_KEY_CREATED, new Date());
        log.info("claims : {}", claims);
        return generateToken(claims);
    }

    private Claims getClaimsFromToken(String jws) {
        try {
            return Jwts.parser().verifyWith(key).build().parseSignedClaims(jws).getPayload();
        } catch (Exception e) {
            log.info("JWT格式验证失败:{}", jws);
            return null;
        }
    }

    public Claims verifyAndGetClaims(String jws) {
        Claims claims = getClaimsFromToken(jws);
        if (claims == null) {
            return null;
        }
        boolean expired = claims.getExpiration().before(new Date());
        if(expired){
            return null;
        }
        return claims;
    }

    public static String getUsernameFromClaims(Claims claims) {
        return claims.getSubject();
    }

    public String refreshToken(String token) {
        token = token.substring(BEARER.length());
        Claims claims = getClaimsFromToken(token);
        if (claims == null) {
            return null;
        }
        Date expireAt = claims.getExpiration();
        Date createDate = claims.get(CLAIM_KEY_CREATED, Date.class);
        if (expireAt.before(new Date())) {
            return null;
        }
        long now = System.currentTimeMillis();
        long createTimePlus = now + 1000 * expiration;
        if (createDate.before(new Date(createTimePlus))) {
            return null;
        }
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }
}
