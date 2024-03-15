-- 순위함수
-- 회원 테이블에서 키가 큰 순으로 정렬하시오
SELECT * FROM usertbl ORDER BY height DESC;

-- 위 결과에 순위를 표시하시오
SELECT ROW_NUMBER() OVER(ORDER BY height DESC) NAME, addr, height
FROM usertbl;

SELECT DENSE_RANK() OVER(ORDER BY height DESC, NAME ASC) 키큰순위, NAME
FROM usertbl;

SELECT DENSE_RANK() OVER(ORDER BY height DESC) RANK, NAME, addr, height
FROM usertbl;

SELECT RANK() OVER(ORDER BY height DESC) RANK, NAME, addr, height
FROM usertbl;

SELECT ntile(2) OVER(ORDER BY height DESC) '반번호', NAME, addr, height
FROM usertbl;

-- PIVOT

CREATE TABLE pivotTest(
	uName CHAR(3),
	season CHAR(3),
	amount INT
);

INSERT INTO pivotTest VALUES
('김범수', '겨울', 10), ('윤종신', '여름', 15), ('김범수', '가을', 25), ('김범수', '봄', 3), ('김범수', '봄', 37), ('윤종신', '겨울', 40),
('김범수', '여름', 14), ('김범수', '겨울', 22), ('윤종신', '여름', 64); 

SELECT * FROM pivotTest;

SELECT uName,
	SUM(if(season = '봄', amount, 0)) AS '봄',
	SUM(if(season = '여름', amount, 0)) AS '여름',
	SUM(if(season = '가을', amount, 0)) AS '가을',
	SUM(if(season = '겨울', amount, 0)) AS '겨울',
	SUM(amount) AS '합계' FROM pivotTest
GROUP BY uName;

-- TRIGGER
-- 테이블에 삽입, 수정, 삭제 등의 작업(이벤트)이 발생할 때
-- 자동으로 작동되는 개체이다.
-- 테이블에 부착되는 프로그램 코드이다.
-- 직접 실행시킬 수는 없고 오직 핻아 테이블에 이벤트가 발생할 경우에만 실행된다.

USE sqldb;
CREATE TABLE if NOT EXISTS testTBL(
	id INT,
	txt VARCHAR(10)
);

INSERT INTO testTBL VALUES (1, '이엑스아이디');
INSERT INTO testTBL VALUES (2, '애프터스쿨');
INSERT INTO testTBL VALUES (3, '에이오에이');

-- testTBl에 Trigger 부착하기
DROP TRIGGER if EXISTS testTrg;
delimiter //
CREATE TRIGGER testTrg -- 트리거 이름
	AFTER DELETE -- 트리거 동작 시점 시정
	ON testTBL -- 트리거가 부착되는 테이블 지정
	FOR EACH ROW -- 각 행마다 적용
BEGIN
	SET @msg = '가수 그룹이 삭제됨'; -- 트리거 실행 시 작동되는 코드
END //
delimiter;

SET @msg = '';
INSERT INTO testTBl VALUES (4, '나인뮤지스');
SELECT @msg;

UPDATE testTBL SET txt = '에이핑크' WHERE id = 3;
SELECT @msg;

DELETE FROM testTBl WHERE id = 4;
SELECT @msg;

SELECT * FROM testTBL;

-- 회원테이블에 update나 delete를 시도하면, 수정또는 삭제된 데이터를 별도의 ㅌ에ㅣ블에 보관하고 변경된 일자와 변경한 사람을 기록하자.
CREATE TABLE backup_userTBL(
	userID CHAR(8) PRIMARY KEY,
	NAME VARCHAR(10) NOT NULL,
	birthYear INT NOT NULL,
	addr CHAR(2) NOT NULL,
	mobile1 CHAR(3),
	mobile2 CHAR(8),
	height SMALLINT,
	mDate DATE,
	modType CHAR(2), -- 변경된 타입, '수정' 또는 '삭제'
	modDate DATE, -- 변경된 날짜
	modUser VARCHAR(256) -- 변경한 사용자
);

-- Udate 트리거 작성
DROP TRIGGER if EXISTS backUserTbl_UpdateTrg;
DELIMITER //
CREATE TRIGGER backUserTbl_UpdateTrg
	AFTER UPDATE
	ON usertbl
	FOR EACH ROW
BEGIN INSERT INTO backup_UserTBL VALUES (OLD.userID, OLD.name, OLD.birthYear, OLD.addr, OLD.mobile1, OLD.mobile2, OLD.height, OLD.mDate,
	'삭제', CURDATE(), CURRENT_USER());
END //
DELIMITER;

-- Delete
DROP TRIGGER if EXISTS backUserTbl_DeleteTrg;
DELIMITER //
CREATE TRIGGER backUserTbl_DeleteTrg
	AFTER DELETE 
	ON usertbl
	FOR EACH ROW
BEGIN INSERT INTO backup_UserTBL VALUES (OLD.userID, OLD.name, OLD.birthYear, OLD.addr, OLD.mobile1, OLD.mobile2, OLD.height, OLD.mDate,
	'삭제', CURDATE(), CURRENT_USER());
END //
DELIMITER;

UPDATE usertbl SET addr = '몽고', WHERE userID = 'JKW';
DELETE FROM usertbl WHERE height >= 177;

