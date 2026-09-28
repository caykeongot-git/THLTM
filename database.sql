CREATE DATABASE IF NOT EXISTS moshiDB;
USE moshiDB;

CREATE TABLE IF NOT EXISTS account (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(255),
    path VARCHAR(255),
    quyen INT
);