DELETE
FROM umsadmin;
INSERT INTO umsadmin (username, password, avatar, email, nickname, create_time, last_login_time, status, note)
VALUES ('admin', '123', 'avatar', 'admin@gmail.com', '张三', NOW(), null, 0, null)