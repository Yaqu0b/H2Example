DROP TABLE IF EXISTS CITY;
CREATE TABLE CITY (
    ID int NOT NULL,
    city_code varchar(255) NOT NULL,
    city_name varchar(255),
    city_pincode int
);

DROP TABLE IF EXISTS STUDENT;
CREATE TABLE STUDENT (
    ID int NOT NULL,
    name varchar(255) NOT NULL,
    age int,
    email varchar(255)
);

DROP TABLE IF EXISTS BOSS;
CREATE TABLE BOSS (
    ID int NOT NULL,
    name varchar(255) NOT NULL,
    age int,
    email varchar(255)
);