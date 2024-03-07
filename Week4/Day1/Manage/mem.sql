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
