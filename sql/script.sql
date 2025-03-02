create table teacher
(
    teacher_id    char(9)                     not null
        primary key,
    teacher_name  varchar(20) charset utf8mb3 null,
    sex           tinyint(1)                  null,
    birth         date                        null,
    department_id char(6)                     null,
    profession    varchar(5) charset utf8mb3  null,
    telephone     varchar(11)                 null,
    home_addr     varchar(30) charset utf8mb3 null,
    postalcode    char(6)                     null,
    e_mail_addr   varchar(30)                 null
);


