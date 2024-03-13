USE mydb;

CREATE TABLE summerClass(
	sid INT,
	class VARCHAR(20),
	price INT
);

INSERT INTO summerClass VALUES (100, 'XXX', 30000),
(100, 'FORTRAN', 20000),
(200, 'C', 10000),
(150, 'PASCAL', 15000),
(250, 'FORTRAN', 20000);

CREATE TABLE student (
   sid INT PRIMARY KEY,
   class VARCHAR(20)
);

INSERT INTO student VALUES
(100, 'FORTRAN'),
(200, 'C'),
(150, 'PASCAL'),
(250, 'FORTRAN');

CREATE TABLE classList (
   sid INT,
   class VARCHAR(20),
   price INT,
   CONSTRAINT summerClass2 FOREIGN KEY (sid) REFERENCES student(sid) ON UPDATE CASCADE
);

INSERT INTO classList VALUES
(100, 'FORTRAN', 20000),
(200, 'C', 10000),
(150, 'PASCAL', 15000),
(250, 'FORTRAN', 20000);


UPDATE classList SET price = 20000 WHERE sid = (SELECT sid FROM classList WHERE class = 'FORTRAN');

DROP TABLE student;

SELECT * FROM student;

SELECT * FROM classList;

-- 계절학기를 듣는 학생의 학번과 수강하는 과목은?

SELECT sid, class FROM summerClass;

-- C언어 강좌의 수강료는?

SELECT price FROM summerClass WHERE class = 'C';

-- 수강료가 가장 비싼 과목은?

SELECT class FROM summerClass WHERE price = (SELECT MAX(price) FROM summerClass);

-- 계절학기를 듣는 학생 수와 수강료 총액은?

SELECT COUNT(sid), SUM(price) FROM summerClass;

SELECT SUM(price) FROM summerClass;


SELECT MAX(price) FROM summerClass;


SELECT COUNT(price) FROM summerClass;
