#################################################
# 데이터 정의어 (DDL : DATA DEFINITION LANGUAGE) #
#################################################

/*
* 1. TABLE 생성 
*
*
* CREATE TABLE 테이블명 ( 
*    필드명 데이터 타입 [NOT NULL] [KEY] [DEFAULT 값] [EXTRA]
*)
 */

# 주소록 테이블 생성 
CREATE TABLE If NOT EXISTS addrBook (
	num INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(4) NOT NULL,
	tel VARCHAR(4) NOT NULL,
	birthday DATE 
	) AUTO_INCREMENT =101;

# 고객 테이블 생성
CREATE TABLE If NOT EXISTS customer(
	uid VARCHAR(10) NOT NULL PRIMARY KEY, 
	pwd CHAR(44) NOT NULL,  #암호화한 결과를 저장 
	`name` VARCHAR(4) NOT NULL,
	email VARCHAR(20) NOT NULL,
	regDate DATE DEFAULT(CURRENT_DATE),
	isDeleted INT DEFAULT 0
	);


/* 2. 테이블 조회 */

# DB내의 테이블 조회 
SHOW TABLES; 

# 테이블 구조 조회 
DESC customer 


/* 3. 테이블 삭제 */

# 테이블(test2) 삭제 
DROP TABLE test2;

# 테이블 내의 내용을 모두 제거
TRUNCATE test; 

/* 4. 테이블 이름변경 (RENAME) */ 
RENAME TABLE koreanCity To korCity;

/* 5. 테이블 구조변경 (ALTER) */ 
# Customer table에 tel 항목 추가 
ALTER TABLE customer 
      ADD tel VARCHAR(14) ;

# CUSTOMER 테이블에 name 항목 다음에 TEL 항목 추가(위치지정가능)
ALTER TABLE customer ADD tel VARCHAR(14) AFTER `name`;

# customer 테이블의 tel 항목의 not null 추가 
ALTER TABLE customer 
   CHANGE tel tel VARCHAR(14) NOT NULL;
   
# CUSTOMER 테이블에 TEL 항목 삭제
ALTER TABLE customer 
  DROP tel; 


/* 6. view 생성 */

# 인구 700만 이상 도시를 largeCity 뷰 생성
CREATE VIEW largeCity 
 	AS SELECT * FROM city WHERE Population >= 9000000
 	WITH CHECK OPTION ; 


# 서울의 인구를 8900000으로 변경하면 에러 발생 
UPDATE largeCity SET Population = 8900000
WHERE ID = 2331; # 위의 CHECK OPTION때문에 에러가 발생하게됨 

# CITY 테이블에서 변경하면 largeCity 에도 반영됨
UPDATE city SET Population = 9900000 WHERE ID = 2331;
