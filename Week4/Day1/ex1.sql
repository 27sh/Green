-- 테이블 생성하기 
-- DDL : Create
CREATE TABLE tbl_member(
	NAME VARCHAR(20),
	tel VARCHAR(13),
	gender CHAR(1),
	age INT
);


DROP TABLE tbl_member;

-- 데이터 추가 C : insert
INSERT INTO tbl_member(NAME, tel, gender, age)
VALUES ('Faker', '010-1111-1111', 'M', 23 );

INSERT INTO tbl_member(NAME, tel, gender, age)
VALUES ('Tom', '010-2222-2222', 'M', 24);

INSERT INTO tbl_member(NAME, tel, gender, age)
VALUES ('Zeus', '010-3333-3333', 'M', 17);

INSERT INTO tbl_member(NAME, tel, gender, age)
VALUES ('Jhin', '010-4444-4444', 'M', 35);

INSERT INTO tbl_member(NAME, tel, gender, age)
VALUES ('Kane', '010-5555-5555', 'M', 18);

INSERT INTO tbl_member(NAME, tel, gender, age)
VALUES ('Talon', '010-6666-6666', 'M', 27);

INSERT INTO tbl_member(NAME, tel, gender, age)
VALUES ('Lux', '010-7777-7777', 'F', 21);

INSERT INTO tbl_member(NAME, tel, gender, age)
VALUES ('Sindra', '010-8888-8888', 'F', 25);

INSERT INTO tbl_member(NAME, tel, gender, age)
VALUES ('Zed', '010-9999-9999', 'M', 24);

INSERT INTO tbl_member(NAME, tel, gender, age)
VALUES ('Ahri', '010-0000-0000', 'F', 20);
tbl_member
-- 데이터 수정 U : update
-- UPDATE tbl_member SET age = 30, tel= '010-3333-3334' WHERE NAME = 'Amy';
-- UPDATE tbl_member SET gender = 'F' WHERE NAME = 'Ahri';

-- 데이터 삭제 D : delete
 DELETE FROM tbl_member WHERE NAME = 'Amy';

-- 데이터 조회 R : select
SELECT * from tbl_member ORDER BY age DESC, NAME ASC;

CREATE TABLE tbl_member2 (
   mno INT AUTO_INCREMENT PRIMARY KEY,
   NAME VARCHAR(20) NOT NULL,
   tel VARCHAR(13) UNIQUE,
   gender CHAR(1) NOT NULL,
   age INT
);


ALTER TABLE tbl_member ADD mno INT AFTER NAME;
DESC tbl_member;
ALTER TABLE tbl_member MODIFY NAME VARCHAR(20) AFTER mno;
DESC tbl_member;

INSERT INTO tbl_member2
(SELECT * FROM tbl_member);

INSERT INTO tbl_member2(NAME, tel, gender, age)
VALUES ('Garen', '010-0000-0000', 'M', 30);

INSERT INTO tbl_member2(NAME, tel, gender, age)
VALUES ('Nami', '010-1234-5678', NULL, 28);

DELETE FROM tbl_member2 WHERE NAME = 'Nami';

SELECT * from tbl_member2

CREATE TABLE tbl_member3 (
   mno INT AUTO_INCREMENT PRIMARY KEY,
   NAME VARCHAR(20) NOT NULL,
   tel VARCHAR(13) UNIQUE,
   gender CHAR(1) NOT NULL,
   age INT
);

INSERT INTO tbl_member3
(SELECT * FROM tbl_member2);

INSERT INTO tbl_member3(NAME, tel, gender, age)
VALUES ('Garen', '010-5678-0000', 'M', 30);

INSERT INTO tbl_member3(NAME, tel, gender, age)
VALUES ('Nami', '010-1234-5678', 'F', 28);

SELECT * from tbl_member3

SELECT * FROM tbl_member3 WHERE NAME LIKE '%m%';

CREATE TABLE tbl_member4(
	NAME VARCHAR(20) NOT NULL,
	tel VARCHAR(13) UNIQUE,
	gender CHAR(1) NOT NULL,
	age INT
);

INSERT INTO tbl_member4(NAME, tel, gender, age)
VALUES ('Garen', '010-5678-0000', 'M', 30);

SELECT * from tbl_member4
