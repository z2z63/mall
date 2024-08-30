DROP TABLE IF EXISTS `umsadmin`;
CREATE TABLE IF NOT EXISTS `umsadmin`
(
    id              bigint primary key auto_increment,
    username        varchar(128),
    password        varchar(128),
    avatar          varchar(128),
    email           varchar(128),
    nickname        varchar(128),
    create_time     date default CURRENT_TIMESTAMP,
    last_login_time date,
    status          int,
    note            varchar(128)
);