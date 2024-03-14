USE sqldb;

CREATE TABLE usertbl(
	userID CHAR(8) PRIMARY KEY,
	NAME VARCHAR(10) NOT NULL,
	birthYear INT NOT NULL CHECK (birthYear BETWEEN 1900 and 2024),
	addr CHAR(2) NOT NULL,
	mobile1 CHAR(3) CHECK (mobile1 IN ('011', '016', '018', '019')),
	mobile2 CHAR(8),
	height SMALLINT,
	mDate DATE,
	grade CHAR(1) DEFAULT 'A' CHECK(grade IN ('A', 'B', 'C'))
);

CREATE TABLE buytbl(
	num INT AUTO_INCREMENT PRIMARY KEY,
	userID CHAR(8) NOT NULL,
	prodName CHAR(6) NOT NULL,
	groupName CHAR(4),
	price INT NOT NULL,
	amount SMALLINT NOT NULL,
	FOREIGN KEY (userID) REFERENCES usertbl(userID)
);

INSERT INTO usertbl VALUES('LSG','이승기', 1987, '서울', '011', '1111111', 182, '2008-8-8', DEFAULT);
INSERT INTO usertbl VALUES('KBS','김범수', 1979, '경남', '011', '2222222', 173, '2012-4-4', DEFAULT);
INSERT INTO usertbl VALUES('KKH','김경호', 1971, '전남', '019', '3333333', 177, '2007-7-7', DEFAULT);
INSERT INTO usertbl VALUES('JYP','조용필', 1950, '경기', '011', '4444444', 166, '2009-4-4', DEFAULT);
INSERT INTO usertbl VALUES('SSK','성시경', 1979, '서울', NULL, NULL, 186, '2013-12-12', DEFAULT);
INSERT INTO usertbl VALUES('LJB','임재범', 1963, '서울', '016', '6666666', 182, '2009-9-9', DEFAULT);
INSERT INTO usertbl VALUES('YJS','윤종신', 1969, '경남', NULL, NULL, 170, '2012-4-4', DEFAULT);
INSERT INTO usertbl VALUES('EJW','은지원', 1972, '경북', '011', '8888888', 173, '2013-4-4', DEFAULT);
INSERT INTO usertbl VALUES('JKW','조관우', 1965, '경기', '018', '9999999', 175, '2014-4-4', DEFAULT);
INSERT INTO usertbl VALUES('BBK','바비킴', 1973, '서울', '011', '0000000', 177, '2012-4-4', DEFAULT);


DROP TABLE usertbl;
DROP TABLE buytbl;

INSERT INTO buyTBL VALUES (NULL, 'KBS', '운동화', NULL, 30, 2);
INSERT INTO buyTBL VALUES (NULL, 'KBS', '노트북', '전자', 1000, 1);
INSERT INTO buyTBL VALUES (NULL, 'JYP', '모니터', '전자', 200, 5);
INSERT INTO buyTBL VALUES (NULL, 'BBK', '모니터', '전자', 200, 3);
INSERT INTO buyTBL VALUES (NULL, 'KBS', '청바지', '의류', 50, 3);
INSERT INTO buyTBL VALUES (NULL, 'BBK', '메모리', '전자', 80, 10);
INSERT INTO buyTBL VALUES (NULL, 'SSK', '책', '서적', 15, 5);
INSERT INTO buyTBL VALUES (NULL, 'EJW', '책', '서적', 15, 2);
INSERT INTO buyTBL VALUES (NULL, 'EJW', '청바지', '의류', 50, 1);
INSERT INTO buyTBL VALUES (NULL, 'BBK', '운동화', NULL, 30, 2);
INSERT INTO buyTBL VALUES (NULL, 'EJW', '책', '서적', 15, 1);
INSERT INTO buyTBL VALUES (NULL, 'BBK', '운동화', NULL, 30, 2);

DESC usertbl;

SELECT * FROM userTBL;
SELECT * FROM buytbl;

SELECT userID, NAME, height
FROM usertbl
WHERE height >= 180;

-- 1970년 이후에 출생하고, 신장이 182 이상인 사람의 아이디와 이름을 조회하시오.

SELECT userID, NAME
FROM usertbl
WHERE birthYear >= 1970 AND height >= 182;

-- 1970년 이후에 출생했거나, 신장이 182 이상인 사람의 아이디와 이름을 조회하시오.

SELECT userID, NAME
FROM usertbl
WHERE birthYear >= 1970 OR height >=182;

-- 키가 180 ~ 183인 사람을 조회하시오.

SELECT NAME
FROM usertbl
WHERE height BETWEEN 180 AND 183;

-- 지역이 경남, 전남, 경북인 사람의 정보를 조회하시오.

SELECT *
FROM usertbl
WHERE addr IN ('경남', '전남', '경북');

-- 성이 '김'씨인 사람의 정보를 조회하시오.

SELECT *
FROM usertbl
WHERE NAME LIKE '김%';

-- 이름의 두번째 글자가 '용'이고, 그 이후 몇글자든 아무거나 오는 값을 추출하시오

SELECT NAME
FROM usertbl
WHERE NAME LIKE '_용%';

-- 키가 172보다 큰 사람의 이름을 조회하시오.

SELECT NAME
FROM usertbl
WHERE height >= 172;

-- 전체 구매자가 구매한 물품 개수의 평균을 구하시오

SELECT AVG(item_count) AS average_items_purchased
FROM (
   SELECT userID, SUM(amount) AS item_count
   FROM buytbl
   GROUP BY userID
) AS item_counts;


-- 가장 큰 키의 회원과 가장 작은 키의 회원의 이름과 키를 출력하시오

SELECT NAME, height
FROM usertbl
WHERE height = (SELECT MAX(height) FROM usertbl)
   OR height = (SELECT MIN(height) FROM usertbl);

-- 휴대폰이 있는 사용자의 수를 출력하시오

SELECT COUNT(*)
FROM usertbl
WHERE mobile1 IS NOT NULL;

-- 사용자별 총 구매액이 1000 이상인 사용자를 조회하시오

SELECT *
FROM usertbl u
JOIN buytbl b ON u.userid = b.userID
GROUP BY u.userid, u.name
HAVING SUM(b.price * b.amount) >= 1000;

-- //////////////////////////////////////////

SELECT u.userID, u.name, b.prodName
FROM usertbl u
JOIN buytbl b ON u.userid = b.userid

-----------------------------------

CREATE TABLE product(
	pid CHAR(3) PRIMARY KEY,
	pname VARCHAR(20),
	price INT
);

CREATE TABLE incoming(
	ino INT AUTO_INCREMENT PRIMARY KEY,
	indate DATETIME DEFAULT NOW(),
	pid CHAR(3),
	qty INT,
	FOREIGN KEY(pid) REFERENCES product(pid)
);


CREATE TABLE outgoing(
	ono INT AUTO_INCREMENT PRIMARY KEY,
	outdate DATETIME,
	pid CHAR(3),
	qty INT,
	FOREIGN KEY(pid) REFERENCES product(pid)
);
DESC product;
DESC incoming;
DESC outgoing;

INSERT INTO product VALUES('p01', 'TV', 200);
INSERT INTO product VALUES('p02', 'DVD', 100);
INSERT INTO product VALUES('p03', 'PC', 150);
INSERT INTO product VALUES('p04', 'AUDIO', 100);
INSERT INTO product VALUES('p05', 'MONITOR', 50);

SELECT * FROM product;

INSERT INTO incoming VALUES(NULL, DEFAULT, 'p01', 3);
INSERT INTO incoming VALUES(NULL, DEFAULT, 'p02', 5);
INSERT INTO incoming VALUES(NULL, DEFAULT, 'p03', 10);
INSERT INTO incoming VALUES(NULL, DEFAULT, 'p01', 7);
INSERT INTO incoming VALUES(NULL, DEFAULT, 'p03', 5);
INSERT INTO incoming VALUES(NULL, DEFAULT, 'p03', 2);

SELECT * FROM incoming;

SELECT pid, SUM(qty) total
FROM incoming
GROUP BY pid;

-- lEFT JOIN (product - incoming)
SELECT p.pid, p.pname, p.price, SUM(i.qty)
FROM product p
	LEFT JOIN incoming i
ON p.pid = i.pid
GROUP BY p.pid;

INSERT INTO outgoing VALUES (NULL, NOW(), 'p02', 1);
INSERT INTO outgoing VALUES (NULL, NOW(), 'p02', 3);
INSERT INTO outgoing VALUES (NULL, NOW(), 'p01', 3);
INSERT INTO outgoing VALUES (NULL, NOW(), 'p01', 5);

SELECT * FROM outgoing;

-- LEFT JOIN : product - outgoing
SELECT p.pid, p.pname, p.price, SUM(o.qty) outSum
FROM product p
	LEFT JOIN outgoing o
ON p.pid = o.pid
GROUP BY p.pid; 

-- right JOIN : product - outgoing
SELECT p.pid, p.pname, p.price, SUM(o.qty) outSum
FROM product p
	RIGHT JOIN outgoing o
ON p.pid = o.pid
GROUP BY p.pid; 

-- 재고 현황표(product - incoming - outgoing)


SELECT a.pid, a.pname, a.price, a.inSum, b.outSum
FROM
(SELECT p.pid, p.pname, p.price, ifnull(SUM(i.qty), 0) inSum
FROM product p
	LEFT JOIN incoming i
ON p.pid = i.pid
GROUP BY p.pid) a
	LEFT JOIN (SELECT p.pid, p.pname, p.price, IFNULL(SUM(o.qty), 0) outSum
FROM product p
	LEFT JOIN outgoing o
ON p.pid = o.pid
GROUP BY p.pid)b
ON a.pid = b.pid;






