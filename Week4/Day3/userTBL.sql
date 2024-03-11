USE mydb;

DROP TABLE usertbl;

CREATE TABLE userTBL (
   userName VARCHAR(3) PRIMARY KEY,
--   birthYear INT CHECK(birthYear >= 1900 AND birthYear <= 2024),
   birthYear INT CHECK(birthYear between 1900 AND 2024),
   addr VARCHAR(2) NOT NULL DEFAULT '부산',
   mobile VARCHAR(12) NULL,
   gender CHAR(1) CHECK(gender IN('M', 'F'))
);

INSERT INTO userTBL(userName, birthYear, addr, mobile, gender)
VALUES('이승기', 1984, DEFAULT, '011-222-2222', 'M');

INSERT INTO userTBL
VALUES('이만기', 1999, '서울', '011-222-3333', 'M');

INSERT INTO userTBL
VALUES('이지은', 1996, '경기', '033-112-5554', 'F');

INSERT INTO userTBL
VALUES('이찬혁', 2000, '대구', '031-888-8888', 'M');

INSERT INTO userTBL
VALUES('이수현', 1999, '대구', '031-888-8888', 'F');


UPDATE usertbl SET birthYear  = 2002 WHERE userName '이수현';

DROP TABLE buytbl;

CREATE TABLE buyTBL (
   userName VARCHAR(3),
   prodName VARCHAR(3) NOT NULL,
   price INT NOT NULL,
   amount INT NOT NULL,
	CONSTRAINT fk_userTBL_buyTBL
   FOREIGN KEY (userName) REFERENCES userTBL(userName)
   ON UPDATE CASCADE
);

INSERT INTO buyTBL
VALUES ('이승기', '신발', '10', 1);

INSERT INTO buyTBL
VALUES ('이만기', '모니터', '500', 1);


SELECT *
FROM userTBL AS u
join buyTBL AS b
ON u.userName = b.userName
	
SELECT DISTINCT addr from usertbl ORDER BY addr DESC; -- distinct 중복제거

SELECT * FROM usertbl WHERE gender = (SELECT gender FROM usertbl WHERE userName = '이승기');

SELECT * from buyTBL;	
