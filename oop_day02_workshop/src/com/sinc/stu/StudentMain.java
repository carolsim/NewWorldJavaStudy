package com.sinc.stu;


public class StudentMain {

	public static void main(String[] args) {
		
		StuVO[] stus=new StuVO[3];
		stus[0]=new StuVO("홍길동",15,170,80);
		stus[1]=new StuVO("한사람",13,180,70);
		stus[2]=new StuVO("임걱정",16,175,65);
		
		double asum=0;
		double hsum=0;
		double wsum=0;
		System.out.println("이름\t나이\t신장\t몸무게");
		System.out.println("________________________________");
		for(int i=0;i<stus.length;i++) {
			stus[i].studentInfo();
		}
		for(int i=0;i<stus.length;i++) {
			asum+=stus[i].getAge();
			hsum+=stus[i].getHeight();
			wsum+=stus[i].getWeight();
		}
		System.out.println("나이 평균:"+(double)(asum/3.0));
		System.out.println("신장 평균:"+(double)(hsum/3.0));
		System.out.println("몸무게 평균:"+(double)(wsum/3.0));
		
		int amax=0;
		int amin=stus[0].getAge();
		int hmax=0;
		int hmin=stus[0].getHeight();
		int wmax=0;
		int wmin=stus[0].getWeight();
		
		for(int i=0;i<stus.length;i++) {
			if(stus[i].getAge()>amax) amax=stus[i].getAge();
			if(stus[i].getAge()<amin) amin=stus[i].getAge();
			if(stus[i].getHeight()>hmax) hmax=stus[i].getHeight();
			if(stus[i].getHeight()<hmin) hmin=stus[i].getHeight();
			if(stus[i].getWeight()>wmax) wmax=stus[i].getWeight();
			if(stus[i].getWeight()<wmin) wmin=stus[i].getWeight();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
