CREATE TABLE customers(
id          BIGINT          PRIMARY KEY AUTO_INCREMENT,
first_name  VARCHAR(50)     NOT NULL ,
last_name   VARCHAR(100)    NOT NULL ,
address     VARCHAR(100)             ,
budget      DECIMAL
);
