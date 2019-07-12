package test.model.str;

public class StringBiz {
	public String compareStr(String str01, String str02) {
		String msg = null; //지역변수 선언시 명시적인 초기화를 하지 않을시 문법적으로 오류가 발생
		/*
		 * if( str01 == str02) { msg = "=="; }else { msg = "!="; }
		 */
		//삼항 연산자
		msg=(str01.equals(str02))? "==": "!=";//equals는 주소값이 아니라 값을 비교하는 메서드임!!!
		//System.out.println("Result: " + msg);
		return msg;
	}
}
