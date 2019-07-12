package com.sinc.oop.util;

public class Division {
	/* 현업에서는 static변수를 
	 * 데이터의 일관성이 유지할 수 없기때문
	 * 하지만 얘는 final을 쓸 수 있다
	 * 그래서 현업에서는 static final을 쓴다
	 * 공유할수있는 static 변수이나 밖에서 변경을 할 수 없는 <상수> final이기 때문
	 * final이 붙으면 명시적인 초기화를 해야한다--?
	 * 그리고 private을 쓸 수 없다
	 * 
	 * */
	
	//private static final String STU = 1;
	public static final int STU = 1;
	public static final int TEC = 2;
	public static final int EMP = 3;
	
}
