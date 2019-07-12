SELECT	EMP_NAME as 이름,
		SALARY*12 "1년 급여",
		(SALARY+(SALARY*BONUS_PCT))*12 as 총소득
FROM	EMPLOYEE;

select	EMP_ID as "empid",
		EMP_NAME as "이름",
		SALARY as "급여(원)"
from	EMPLOYEE;

select	EMP_ID,
		EMP_NAME,
		'재직' as 근무여부
from EMPLOYEE

select	distinct DEPT_ID
from	EMPLOYEE;

select	distinct JOB_ID, DEPT_ID
from	EMPLOYEE;

select	EMP_NAME AS 이름,
		DEPT_ID as 부서
from	EMPLOYEE
where	DEPT_ID = '90';

select	EMP_NAME as 이름,
		SALARY as 급여
from	EMPLOYEE
where	SALARY > 4000000;

select	EMP_ID||EMP_NAME||SALARY
from	EMPLOYEE;

select	EMP_NAME||'의 월급은'||SALARY||'원 입니다.'--이 전체가 하나의 문자열로 리턴된다.--
from	EMPLOYEE;

select	EMP_NAME,
		SALARY
from	EMPLOYEE
where	SALARY between 3500000 and 5500000;

select	EMP_NAME,
		SALARY
from	EMPLOYEE
WHERE	SALARY >= 3500000
and		SALARY <= 5500000;

select	*
from	EMPLOYEE;

select	EMP_NAME, MGR_ID, DEPT_ID
from	EMPLOYEE
where	MGR_ID is NULL
and		DEPT_ID is NULL;

select	EMP_NAME, DEPT_ID, BONUS_PCT
from	EMPLOYEE
where	DEPT_ID is NULL
and		BONUS_PCT is not NULL;

select	EMP_NAME,
		EMAIL
from	EMPLOYEE
where 	EMAIL like '___\_%' escape '\';

select	EMP_NAME, DEPT_ID, SALARY
from	EMPLOYEE
where	DEPT_ID IN('60','90');
--이 둘이 같습니당--
select	EMP_NAME, DEPT_ID, SALARY
from	EMPLOYEE
where	DEPT_ID ='60'
or		DEPT_ID ='90';

select	EMP_NAME, SALARY, DEPT_ID
from	EMPLOYEE
where	(DEPT_ID ='20'
or		DEPT_ID ='90')
and		SALARY > 3000000;--괄호 없을시에 300만원 이하도 결과에 반영됨--

--워크북--
--1.--
select	DEPARTMENT_NAME as "학과 명",
		CATEGORY as 계열
from TB_DEPARTMENT;

--2--
select DEPARTMENT_NAME||'의 정원은'||CAPACITY||'명 입니다.'as "학과별 정원"
from TB_DEPARTMENT;

--3--
select DEPARTMENT_NO
from TB_DEPARTMENT
where DEPARTMENT_NAME = '국어국문학과';


select STUDENT_NAME
from TB_STUDENT
where DEPARTMENT_NO = '001'
and ABSENCE_YN = 'Y'
and STUDENT_SSN like '%-2%';

--4--
select STUDENT_NAME
from TB_STUDENT
where STUDENT_NO in ('A513079', 'A513090', 'A513091', 'A513110', 'A513119')

--5--
select DEPARTMENT_NAME, CATEGORY
from TB_DEPARTMENT
where CAPACITY between 20 and 30;

--6--
select PROFESSOR_NAME
from TB_PROFESSOR
where DEPARTMENT_NO is NULL;

--7--
select *
from TB_STUDENT
where DEPARTMENT_NO is NULL;

--8--
select CLASS_NO
from TB_CLASS
where PREATTENDING_CLASS_NO is not NULL;

--9--
select DISTINCT CATEGORY 
from TB_DEPARTMENT

--10--
select STUDENT_NO, STUDENT_NAME, STUDENT_SSN
from TB_STUDENT
where ABSENCE_YN='N'
and STUDENT_NO like 'A2%'and STUDENT_ADDRESS like '%전주%';


--다시 수업--

select	LENGTH(CHARTYPE),
		LENGTH(VARCHARTYPE)
from	COLUMN_LENGTH;

--문자열위치 반환--
select	EMAIL,
		INSTR(EMAIL,'c',-1,2)
from	EMPLOYEE;

select 	EMAIL,
		INSTR(EMAIL,'c',INSTR(EMAIL,'.')-1)
from	EMPLOYEE;

--사원테이블에서 메일아이디만 출력하세요
select	EMAIL,
		SUBSTR(EMAIL,1,INSTR(EMAIL,'@')-1) as ID
from EMPLOYEE;

select LTRIM('xyxzyyyTech','xyz')
from DUAL;

select LTRIM('6372Tech','0123456789')
from DUAL;

select LTRIM('    Tech')
from DUAL;




