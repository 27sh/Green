# Day 2
24.3.8

## DB

게시글 작성 관리 프로그램

(note :: Connect.java / IMemberDao.java / MemberDao_maria.java / UI.java / MemberManager.java / Member.java)

sql :: 

CREATE TABLE tbl_note (

   mno INT AUTO_INCREMENT PRIMARY KEY,
   
   id VARCHAR(20),
   
   title VARCHAR(20) NOT null,
   
   writing CHAR(100) NOT NULL
   
);

      insert

  ![이미지](./img/insert.PNG)

      select (전체)

  ![이미지](./img/select1.PNG)

      select (지정)

  ![이미지](./img/select2.PNG)

      delete & update

  ![이미지](./img/option.PNG)

      결과 확인

  ![이미지](./img/result.PNG)
