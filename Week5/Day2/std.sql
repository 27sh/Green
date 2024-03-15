USE sqldb

CREATE TABLE student_tbl(
	sno INT AUTO_INCREMENT PRIMARY key,
	NAME CHAR(13),
	addr CHAR(2)
);


INSERT INTO student_tbl VALUES
(NULL, '김범수', '경남'),
(NULL, '성시경', '서울'),
(NULL, '조용필', '경기'),
(NULL, '은지원', '경북'),
(NULL, '바비킴', '서울');

CREATE TABLE clubTBL(
	NAME CHAR(5) PRIMARY KEY,
	classroom CHAR(4)
);

DROP TABLE clubTBL;

INSERT INTO clubTBL VALUES
('수영', '101호'),
('바둑', '102호'),
('축구', '103호'),
('봉사', '104호');

CREATE TABLE takeclass(
	st_name CHAR(13),
	class_name CHAR(5)
);

DROP TABLE takeclass;

INSERT INTO takeclass VALUES
('김범수', '바둑'),
('김범수', '축구'),
('조용필', '축구'),
('은지원', '봉사'),
('바비킴', '봉사');

INSERT INTO takeclass VALUES ('은지원','축구');

SELECT * FROM student_tbl;

SELECT * FROM clubTBL;

SELECT * FROM takeclass;

SELECT DISTINCT a.name, a.addr, b.class_name, b.classroom
FROM (SELECT s.name, s.addr, t.class_name
FROM student_tbl s
	LEFT JOIN takeclass t
ON s.name = t.st_name) a
	LEFT JOIN (SELECT t.st_name, t.class_name, c.classroom
		FROM takeclass t
		LEFT JOIN clubTBL c
		ON t.class_name = c.name) b
ON a.name = b.st_name;


-- ------------------------------------------

SELECT s.name, s.addr, t.class_name
FROM student_tbl s
	LEFT JOIN takeclass t
ON s.name = t.st_name;

SELECT t.st_name, t.class_name, c.classroom
FROM takeclass t
	LEFT JOIN clubTBL c
ON t.class_name = c.name;
