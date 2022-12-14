###############################
# 날짜/시간 조작 
###############################

/*
 * 1. 테이블 생성 
 */ 

 CREATE TABLE dateTable (
   id INT PRIMARY KEY AUTO_INCREMENT,
   `date` DATE,
   `datetime` DATETIME DEFAULT CURRENT_TIMESTAMP
   ) AUTO_INCREMENT = 101;


/*
 * 2. 데이터 입력 
 */

# 하나의 데이터값 입력 
 INSERT INTO dateTable VALUES (DEFAULT, '2022-11-17', DEFAULT);

# 여러개의 데이터값 입력 
 INSERT INTO dateTable(`date`, `datetime`) VALUES 
    ('2001-11-23', '2001-11-23 11:20:01'),
    ('2005-10-24', '2005-10-24 10:04:35');

# 2022-11-17 형식의 값을 얻고 싶을 경우 
SELECT 'date' , DATE_FORMAT(`datetime`, '%Y-%m-%d') FROM dateTable;

# 시간만 표시 (11:26:24 AM 형식) 
SELECT DATE_FORMAT(`datetime`, '%r') FROM dateTable;
SELECT DATE_FORMAT(`datetime`, '%h:%i:%s:%p') FROM dateTable;

# 22-11-17 14:28 표시 하고싶을 경우 
SELECT DATE_FORMAT(`datetime`, '%y-%m-%d %h:%i') AS ModifyTime FROM dateTable;

# 날짜 조회 함수
SELECT NOW(), CURDATE(), CURTIME();

# 날짜 더하기 빼기 => 현재부터 40일 이후 날짜 
SELECT DATE_ADD(NOW(), INTERVAL 40 DAY); 

# 날짜 더하기 뺴기 => 3개월 더하기 
SELECT DATE_SUB(NOW(), INTERVAL 3 MONTH); 

# D-DAY 계산
SELECT TO_DAYS('2023-03-08') - TO_DAYS(NOW());

# 요일  1- 일요일 
SELECT DAYOFWEEK(`datetime`) FROM dateTable;
