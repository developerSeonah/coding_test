-- SELECT
--테이블에서 원하는 데이터를 조회할 때
SELECT col1, col2 FROM table_name
-- 모든 컬럼을 조회
SELECT * FROM table_name

--DISTINCT
-- 중복을 배제하고 고유 값만을 출력하고자 할 때
SELECT DISTINCT col1, col2 FROM table_name

--WHERE
SELECT col1,col2 FROM table_name WHERE condition

-- 비교연산자
-- 같을 떄
SELECT * FROM table_name
WHERE column_name = value;

-- 같지 않을 떄
-- != <>
SELECT * FROM table_name
WHERE column_name != value;

SELECT * FROM table_name
WHERE colmn_name <> value;

-- 클 때
SELECT * FROM table_name
WHERE column_name > value;

-- 크거나 같을 때
SELECT * FROM table_name
WHERE column_name >= value;





