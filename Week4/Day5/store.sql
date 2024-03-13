USE mydb;

CREATE TABLE shoesStore(
	sno INT AUTO_INCREMENT PRIMARY KEY,
	NAME VARCHAR(20) NOT NULL,
	price INT NOT NULL,
	brand VARCHAR(20)
);

DROP TABLE shoesStore;

INSERT INTO shoesStore VALUES
(1, 'FORTRAN', 20000),
(2, 'C', 10000),
(3, 'PASCAL', 15000),
(4, 'FORTRAN', 20000);

CREATE TABLE prod(
	pid CHAR(3) PRIMARY KEY,
	pname VARCHAR(20)
);

INSERT INTO prod VALUES('p01', 'A'),('p02','B'),('p03','C');

CREATE TABLE incoming(
	pid CHAR(3),
	qty INT,
	FOREIGN KEY (pid) REFERENCES prod(pid)
);

INSERT INTO incoming VALUES ('p01', 10), ('p01', 5), ('p03', 3);

CREATE TABLE outgoing(
	pid CHAR(3),
	qty INT,
	FOREIGN KEY (pid) REFERENCES prod(pid)
);

INSERT INTO outgoing VALUES ('p01', 5), ('p01', 2), ('p02', 1);





SELECT i.pid, i.icnt, o.ocnt
FROM
(SELECT pid, SUM(qty) icnt FROM incoming GROUP BY pid) i,
(SELECT pid, SUM(qty) ocnt FROM outgoing GROUP BY pid) o
WHERE i.pid = o.pid;





CREATE VIEW v_stockTBL
AS
SELECT p.pid, p.pname, io.icnt, io.ocnt, (io.icnt - io.ocnt) AS `재고`
FROM
(SELECT i.pid, i.icnt, o.ocnt
FROM
(SELECT pid, SUM(qty) AS icnt FROM incoming GROUP BY pid) i,
(SELECT pid, SUM(qty) ocnt FROM outgoing GROUP BY pid) o
WHERE i.pid = o.pid) io, prod p
WHERE io.pid = p.pid;

SELECT * FROM v_stockTBL;

DROP VIEW v_stockTBL;
