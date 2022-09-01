
DROP DATABASE IF EXISTS todospring;
CREATE DATABASE todospring;
USE todospring;
DROP TABLE IF EXISTS todo;

CREATE TABLE todo (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    description VARCHAR(250) NOT NULL
);



INSERT INTO todo (name, description) VALUES
    ('tache 1', 'faire l\'appli todo'),
    ('tache 2 ', 'retourner se coucher')