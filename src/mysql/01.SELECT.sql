/*
 * 데이터 조작언어 (DML : Data Manipulation Language)
 */

 /* 1.Select */
 USE world;  # 사용할 데이터베이스 선택
 SHOW TABLES; #현 데이터베이스에 있는 테이블 조회
 DESC city; # city table의 구조 보기 

/* Select 필드명 FROM 테이블명 
        WHERE 조건
        GROUP BY 필드명
        HAVING 그룹 조건
        ORDER BY 필드명 순서
        LIMIT 숫자 OFFSET 숫자 ; 
*/

SELECT * FROM city ; #city테이블에 있는 내용을 전부 가져오기
SELECT `Name`, Population From city; 
SELECT NOW(); # 현재날짜,시각 표현 함수 

/* 조회조건 */
SELECT * FROM city WHERE countrycode = 'KOR';  #한국의 도시만 조회됨

#원하는필드내에서 조건조회 
SELECT Name, District, Population FROM city WHERE countrycode = 'KOR'; 
SELECT Name, District, Population FROM city 
    WHERE countrycode = 'KOR' AND Population > 1000000 ;


#대한민국 광역시도명 (distinct : 고유한) 
SELECT DISTINCT District
	FROM city 
    WHERE countrycode = 'KOR';  


# 한국의 인구수 100만 이상인 도시중 인구수가 홀수인 도시 
SELECT * FROM city 
	WHERE CountryCode = 'KOR' 
	AND Population > 1000000 
	AND  Population % 2 != 0;

# 한국의 인구수 50만 ~ 100만도시 
SELECT * FROM city 
	WHERE CountryCode = 'KOR' 
	AND Population BETWEEN 500000 AND 1000000;

# 충청남북도의도시  
SELECT * FROM city 
	WHERE CountryCode = 'KOR'
	AND District LIKE 'Chungchong%';


/* 순서 */ 
# 전세계에서 인구가 800만 이상인 도시를 내림차순으로 조회 (DESC = descending)
SELECT * FROM city 
	WHERE Population >= 8000000
	ORDER BY Population DESC; 

# 한국에서 100만이상인 도시를 내림차순으로 조회 
SELECT * FROM city 
	WHERE Population >= 1000000
	AND Countrycode = 'KOR'
	ORDER BY Population DESC; 
    
# 한국에서 50만이상인 도시를 광역시도 오름차순(ASC), 인구순 내림차순(DESC)으로 조회 
SELECT * FROM city 
	WHERE Population >= 500000
	AND Countrycode = 'KOR'
	ORDER BY District, Population DESC; -- ASC는 생략 가능함 

# 전세계 인구수 TOP 10
SELECT * FROM city 
	ORDER BY Population DESC
	LIMIT 10 ; 

# 국내 인구수 TOP5
SELECT * FROM city 
	WHERE CountryCode = 'KOR'
	ORDER BY Population DESC
	LIMIT 5 ; 

# 국내 인구수 11~20위
SELECT * FROM city 
	WHERE CountryCode = 'KOR'
	ORDER BY Population DESC
	LIMIT 10 OFFSET 10 ;  // 앞에서 10개를 건너뛰고 그뒤의 10개를 선택하는 것 



/* 함수 */

# 국내 도시의 갯수 
SELECT COUNT(*) FROM city
    WHERE CountryCode = 'KOR';

# 국내 도시의 평균인구수 
SELECT AVG(Population) FROM city
    WHERE CountryCode = 'KOR';

# 국내 도시의 평균 인구수 반올림 (AS = Aliasing)
SELECT ROUND(AVG(Population)) AS AVG_Population FROM city
     WHERE CountryCode = 'KOR';

# 국내 도시의 최대/최소 인구수 
SELECT MAX(Population), MIN(Population) FROM city
     WHERE CountryCode = 'KOR';



/* 그룹 */ 

# 국내 광역시도의 인구수를 내림차순으로 정렬 
SELECT District, SUM(Population) FROM city
     WHERE CountryCode = 'KOR'
	 GROUP BY District 
	 ORDER BY SUM(Population) DESC ; 

# 경기도의 도시이름 (GROUP_CONCAT)
SELECT GROUP_CONCAT(`Name`) FROM city 
    WHERE District = 'kyonggi';

# 한국의 국내 광역시도 이름 
SELECT GROUP_CONCAT(`District`) FROM city 
    WHERE CountryCode = 'KOR';

# 국가별 도시의 갯수가 많은 나라 TOP 10
SELECT CountryCode, COUNT(*) FROM city
	GROUP BY CountryCode
	ORDER BY COUNT(*) DESC 
	LIMIT 10;


/* 그룹의 조건 */

# 국내 도시의 갯수가 5개이상인 도의 인구수 평균 
 SELECT District, ROUND(AVG(Population)), COUNT(*) FROM city 
    WHERE CountryCode = 'KOR' 
    GROUP BY District 
    HAVING COUNT(*) >= 5; 

# 국내 도시의 갯수가 5개 이상인 도의 인구수 평균의 내림차순으로 정렬 
 SELECT District, ROUND(AVG(Population)), COUNT(*) FROM city 
    WHERE CountryCode = 'KOR' 
    GROUP BY District 
    HAVING COUNT(*) >= 5
	ORDER BY AVG(Population) DESC ; 


# 국내 도시의 갯수가 100개 이상인 국가의 인구수 평균을 인구수 평균의  내림차순으로 정렬 
 SELECT CountryCode, ROUND(AVG(Population)), COUNT(*) FROM city 
    GROUP BY CountryCode 
    HAVING COUNT(*) >= 100
	ORDER BY AVG(Population) DESC ; 

# 대륙별 면적, 평균 GNP, 국가의 숫자
SELECT Continent, SUM(SurfaceArea), ROUND(AVG(GNP)), COUNT(*) 
 	FROM country 
   GROUP BY Continent;


/* Table Join */
# 도시의 갯수가 많은 나라 TOP 10 
SELECT country.Name, city.CountryCode, COUNT(city.NAME)  
     FROM city
     JOIN country 
       ON city.CountryCode = country.Code 
    GROUP BY city.CountryCode
    ORDER BY COUNT(city.NAME) DESC
    LIMIT 10;


# 인구가 많은 도시 TOP10의 국가명, 도시명, 인구수 
SELECT r.Name AS Country, l.Name AS City, l.Population FROM city AS l
  JOIN country AS r
    ON l.CountryCode = r.Code
    ORDER BY l.Population DESC 
    LIMIT 10;

# 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 정렬
# (대륙명, 국가명, 도시명, 인구수)를 표시하도록 하기

SELECT r.Continent, r.Name AS 'Country', l.Name AS 'City', l.Population 
FROM city AS l 
JOIN country AS r 
ON l.CountryCode = r.Code
WHERE r.Continent = 'Asia'
ORDER BY l.Population
LIMIT 10; 

# 우리나라의 공식언어는 ? 
SELECT `Language`, CountryCode FROM countrylanguage
  WHERE countryCode = 'KOR'
   AND IsOfficial = TRUE ;

#아시아 국가의 국가명과 공식언어 
SELECT l.Name AS 'Country', r.`Language` FROM country AS l
JOIN countrylanguage AS r 
ON l.Code - r.CountryCode
WHERE l.Continent = 'Asia'
AND r.IsOfficial = TRUE;