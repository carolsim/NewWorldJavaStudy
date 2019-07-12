import test.model.vo.Person;//ctrl+shift+o 누르면 자동임포트
//현장에서는 *를 쓰지말고 정확히 패키지 명세를 하자!-> *쓰면 불필요한 바이트코드까지 생성하기 때문

public class PersonMain {

	public static void main(String[] args) {
		Person per = new Person();//Person class 참조타입. 사용자가 만든 클래스가 변수의 타입이될 수 있다.
		//또는 Person per;
		//기본생성자를 개발자가 명시하지 않더라도 컴파일러가 알아서 생성해줌.
		System.out.println("이름: " + per.getName());
		System.out.println("나이: " + per.getAge());
		System.out.println("키: " + per.getHeight());
		System.out.println("성별: " + per.getGender());
		System.out.println("결혼여부: " + per.isMarried());//return type이 불리언인 메소드는 is로 시작된다.
		
		Person per02 = new Person("섭섭해",24,177.6,'M',true);
		System.out.println("/////////////////////////////////////////////////");
		System.out.println("이름: " + per02.getName());
		System.out.println("나이: " + per02.getAge());
		System.out.println("키: " + per02.getHeight());
		System.out.println("성별: " + per02.getGender());
		System.out.println("결혼여부: " + per02.isMarried());
	}

}