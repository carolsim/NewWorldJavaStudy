select	EMP_NAME,
		HIRE_DATE,
		ADD_MONTH(HIRE_DATE,240)--20년 증가시킴--
from	EMPLOYEE;

--2010년 1월1일 기준으로 입사한지 10년이 넘은 직원들의 근무년수 조회--
--상황에 따라 ROUND나 TRUNC를 쓰세요--
select	EMP_NAME,
		HIRE_DATE,
		MONTHS_BETWEEN('10/01/01', HIRE_DATE)/12 as 근무년수
from	EMPLOYEE
where	MONTHS_BETWEEN('10/01/01', HIRE_DATE)>120;

select TO_CHAR(1234,'99999') FROM DUAL;--1234--
select TO_CHAR(1234,'09999') FROM DUAL;--01234--
select TO_CHAR(1234,'L99999') FROM DUAL;
select TO_CHAR(1234,'99,999') FROM DUAL;
select TO_CHAR(1234,'09,999') FROM DUAL;
select TO_CHAR(1000,'9.9EEEE') FROM DUAL;

select TO_CHAR(SYSDATE, 'PM HH24:MI:SS') FROM DUAL;
select TO_CHAR(SYSDATE, 'AM HH:MI:SS') FROM DUAL;
select TO_CHAR(SYSDATE, 'MON DY,YYYY') FROM DUAL;
select TO_CHAR(SYSDATE, 'YYYY-fmMM-DD DAY') FROM DUAL;
select TO_CHAR(SYSDATE, 'YYYY-MM-fmDD DAY') FROM DUAL;
select TO_CHAR(SYSDATE, 'Year,0') FROM DUAL;

select	EMP_NAME as 이름,
		TO_CHAR(HIRE_DATE,'YYYY-MM-DD') as 입사일
from	EMPLOYEE
where	JOB_ID='J7';

select	EMP_NAME as 이름,
		TO_CHAR(HIRE_DATE,'YYYY"년" MM"월" DD"일"') as 입사일
from	EMPLOYEE
where JOB_ID = 'J7';

select	EMP_NAME as 이름,
		SUBSTR(HIRE_DATE,1,2)||'년'||
		SUBSTR(HIRE_DATE,4,2)||'월'||
		SUBSTR(HIRE_DATE,7,2)||'일'|| as 입사일
from	EMPLOYEE
WHERE	JOB_ID='J7'


select TO_DATE('20100101','YYYYMMDD') from DUAL;
--select TO_CHAR('20100101','YYYY, MON') from DUAL; 오류!!--
select TO_CHAR(TO_DATE('20100101','YYYYMMDD'),'YYYY,MON') from DUAL;
select TO_DATE('041030 143000','YYMMDD HH24MISS') from DUAL;
select TO_CHAR(TO_DATE('041030 143000','YYMMDD HH24MISS'),'DD-MON-YY HH:MI:SS PM') from DUAL;
select TO_DATE('980630','YYMMDD') from DUAL

select TO_CHAR(TO_DATE('980630','YYMMDD'),'YYYY.MM.DD') from DUAL;
--얘를 고치려면--
select TO_CHAR(TO_DATE('980630','RRMMDD'),'YYYY.MM.DD') from DUAL;

--RR주의사항--
select	'2009/10/14' as 현재,
		'95/10/27' as 입력,
		TO_CHAR(TO_DATE('95/10/27','YY/MM/DD'),'YYYY/MM/DD') as YY형식1,--안되는케이스--
		TO_CHAR(TO_DATE('95/10/27','YY/MM/DD'),'RRRR/MM/DD') as YY형식2,--안되는케이스--
		TO_CHAR(TO_DATE('95/10/27','RR/MM/DD'),'YYYY/MM/DD') as RR형식1,
		TO_CHAR(TO_DATE('95/10/27','RR/MM/DD'),'RRRR/MM/DD') as RR형식2
from	DUAL;


--TO_NUMBER--
select	EMP_NAME, EMP_NO,
		SUBSTR(EMP_NO,1,6)as 앞부분,
		SUBSTR(EMP_NO,8)as 뒷부분,
		TO_NUMBER(SUBSTR(EMP_NO,1,6)+SUBSTR(EMP_NO,8))as 결과
from	EMPLOYEE
where	EMP_ID='101';

--TO_NUMBER제외해도 묵시적형변환일어남--
select	EMP_NAME, EMP_NO,
		SUBSTR(EMP_NO,1,6)as 앞부분,
		SUBSTR(EMP_NO,8)as 뒷부분,
		SUBSTR(EMP_NO,1,6)+SUBSTR(EMP_NO,8) as 결과
from	EMPLOYEE
where	EMP_ID='101';

select	EMP_NAME, SALARY, NVL(BONUS_PCT,0)
from	EMPLOYEE
where	SALARY>3500000;

select	EMP_NAME,
		(SALARY*12)+((SALARY*12)*BONUS_PCT)
from	EMPLOYEE
where	SALARY>3500000;

--가장 모범답안--
select	EMP_NAME,
		(SALARY*12)+
		((SALARY*12)+NVL(BONUS_PCT,0))
from	EMPLOYEE
where	SALARY>3500000;


--DECODE(expr대상칼럼,대상칼럼과의 비교값,조건일치시반환값,일치 안할때)--
--DECODE(STUDENT_SSN,'%-1%','남','여')--
select STUDENT_NAME as 이름,DECODE(STUDENT_SSN,'%-1%','남','여') as 성별
from TB_STUDENT;

select	EMP_NAME as 이름,
		DECODE(SUBSTR(EMP_NO,8,1),'1','남자',2,'여자') as 성별
from	EMPLOYEE;

--직급별 인상급여--

select	EMP_NAME as 이름,
		SALARY as 급여,
		JOB_ID as 직급,
		DECODE(JOB_ID,'J7',1.1,'J6',1.15,'J5',1.2,1)*SALARY as 인상급여
from	EMPLOYEE;

select	EMP_ID, EMP_NAME,
		DECODE(MGR_ID,NULL,'없음',MGR_ID)as 관리자
from	EMPOLYEE
where	JOB_ID='J4';


--CASE문(내용은 위와 같음)--

select	EMP_NAME as 이름,
		SALARY as 급여,
		JOB_ID as 직급,
		CASE JOB_ID
		WHEN 'J7' THEN 1.1
		WHEN 'J6' THEN 1.15
		WHEN 'J5' THEN 1.2
		ELSE 1 END *SALARY as 인상급여
from	EMPLOYEE;

--예제--

select	EMP_ID as 아이디,
		EMP_NAME as 이름,
		SALARY as 급여,
		CASE WHEN SALARY <= 3000000 THEN '초급'
		WHEN SALARY <= 4000000 THEN '중급'
		ELSE '고급'
		END as "급여등급"
from	EMPLOYEE;



--그룹함수--
select	DEPT_ID as 부서,
		ROUND(AVG(SALARY),-4) AS 평균급여
from	EMPLOYEE
group by	DEPT_ID
order by 1;

--남 여 성별로 그룹화--
select	DECODE(SUBSTR(EMP_NO,8,1),
			'1','남','3','남','여') as 성별,
		ROUND(AVG(SALARY),-4) as 평균급여
from	EMPLOYEE
group by	DECODE(SUBSTR(EMP_NO,8,1),
			'1','남','3','남','여')
order by 2;

--ROLL UP--
select	DEPT_ID,
		SUM(SALARY)
from	EMPLOYEE
WHERE	DEPT_ID is not null
group by	ROLLUP(DEPT_ID); --부서별 누적총합--

select	DEPT_ID,
		SUM(SALARY)
from	EMPLOYEE
WHERE	DEPT_ID is not null
group by	DEPT_ID;

select	DEPT_ID,
		JOB_ID,
		SUM(SALARY)
from	EMPLOYEE
where	DEPT_ID is not null
AND		JOB_ID is not null
group by ROLLUP(DEPT_ID, JOB_ID)
order by DEPT_ID, JOB_ID;



--workbook--

--1--
select	STUDENT_NO as 학번,
		STUDENT_NAME as 이름,
		ENTRANCE_DATE as 입학년도
from	TB_STUDENT
where	DEPARTMENT_NO='002'
order by ENTRANCE_DATE;

--2--
select	PROFESSOR_NAME,
		PROFESSOR_SSN
from	TB_PROFESSOR
where LENGTH(PROFESSOR_NAME) !=3
order by PROFESSOR_NAME;

--3--
select	PROFESSOR_NAME as 교수이름,
		TO_NUMBER(TO_CHAR(SYSDATE,'YYYY'))
		-(1900+TO_NUMBER(SUBSTR(PROFESSOR_SSN,1,2))) as 나이
from	TB_PROFESSOR
order by 나이;

--4--
select	SUBSTR(PROFESSOR_NAME,2) as 이름
from	TB_PROFESSOR;

--5--
select	STUDENT_NO,
		STUDENT_NAME
from	TB_STUDENT
where	TO_CHAR(ENTRANCE_DATE,'YYYY')
		> TO_CHAR(TO_DATE(SUBSTR(STUDENT_SSN,1,6)),'YYYY') + 19
order by STUDENT_NO desc;

--6--

select TO_CHAR(TO_DATE('2020/12/25'), 'YYYY-MM-DD DAY') FROM DUAL;

--7--
select	TO_CHAR(TO_DATE('99/10/11','YY/MM/DD'),'YYYY/MM/DD') from DUAL;--2099--
select	TO_CHAR(TO_DATE('49/10/11','YY/MM/DD'),'YYYY/MM/DD') from DUAL;--2049--
select	TO_CHAR(TO_DATE('99/10/11','RR/MM/DD'),'YYYY/MM/DD') from DUAL;--1999--
select	TO_CHAR(TO_DATE('49/10/11','RR/MM/DD'),'YYYY/MM/DD') from DUAL;--2049--


--8--		
select	STUDENT_NO,
		STUDENT_NAME
from	TB_STUDENT
where	STUDENT_NO like '9%';

--9--
select	ROUND(AVG(POINT),1)
from	TB_GRADE
where	STUDENT_NO like 'A517178'
group by STUDENT_NO;

--10--
select DEPARTMENT_NO as 학과번호,
		COUNT(DEPARTMENT_NO) as "학생수(명)"
from	TB_STUDENT
group by DEPARTMENT_NO
order by DEPARTMENT_NO;

--11--
select COUNT(*)
from TB_STUDENT
where COACH_PROFESSOR_NO is NULL;

--12--
select	SUBSTR(TERM_NO,1,4) as 년도,
		ROUND(avg(POINT),1) as "년도 별 평점"
from TB_GRADE
where STUDENT_NO like 'A112113'
group by SUBSTR(TERM_NO,1,4)
order by 년도;

--13번--
--select DEPARTMENT_NO as 학과코드명,
		--COUNT(DEPARTMENT_NO) as "휴학생 수"
--from TB_STUDENT
--WHERE ABSENCE_YN='Y'
--group by DEPARTMENT_NO
--order by 학과코드명;

SELECT * FROM TB_STUDENT

--13--
SELECT DEPARTMENT_NO AS 학과코드명,
       SUM(CASE WHEN ABSENCE_YN ='Y' THEN 1 
			     ELSE 0 END) AS "휴학생 수"
FROM   TB_STUDENT
GROUP BY DEPARTMENT_NO
ORDER BY 1;


--14번--
select STUDENT_NAME as 동일이름,
		COUNT(STUDENT_NAME)
from TB_STUDENT
group by STUDENT_NAME
having COUNT(STUDENT_NAME)>=2
order by 동일이름;

--15--
select	SUBSTR(TERM_NO,1,4) as 년도,
		SUBSTR(TERM_NO,5) as 학기,
		ROUND(AVG(POINT),1) as 평점
from TB_GRADE
where STUDENT_NO = 'A112113'
group by ROLLUP(SUBSTR(TERM_NO,1,4),SUBSTR(TERM_NO,5));


















