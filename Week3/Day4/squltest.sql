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
VALUES ('James', '010-1111-1111', 'M', 23 );

INSERT INTO tbl_member(NAME, tel, gender, age)
VALUES ('Tom', '010-2222-2222', 'M', 24);

INSERT INTO tbl_member(NAME, tel, gender, age)
VALUES ('Amy', '010-3333-3333', 'F', 25);

INSERT INTO tbl_member(NAME, tel, gender, age)
VALUES ('Ahri', '010-4444-4444', 'F', 20);

-- 데이터 수정 U : update
UPDATE tbl_member SET age = 30, tel= '010-3333-3334' WHERE NAME = 'Amy';
UPDATE tbl_member SET gender = 'F' WHERE NAME = 'Ahri';

-- 데이터 삭제 D : delete
DELETE FROM tbl_member WHERE NAME = 'Ahri';

-- 데이터 조회 R : select
SELECT * from tbl_member WHERE gender = 'M';
