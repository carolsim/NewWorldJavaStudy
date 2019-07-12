package test.model.vo;
/* .vo란?
 * value object
 * 클래스에서 만들어서 객체로 넘겨주는것
 * */
/* .entity
 */
/* .dto
 * data transfer object
 * 프론트엔드에서 사용자이벤트로
 * 넘어오는 데이터를 담아서
 * 이 객체를 넘겨주는것
 * */

public class Person {
	/*멤버변수 - 전역변수*/
	private	String		name;
	//String은 참조타입, 객체생성을 해야하지만 String의 경우 유일하게 객체생성거치지 않고 기본타입처럼 사용가능
	private	int			age;
	private	double		height;
	private	char		gender;
	private	boolean		isMarried;
	//대부분 개발자가 변수를 private로 둔다. 외부에서 접근할 수 있기에 유효성체크를 할 수 없기 때문
	
	
	//static은 인스턴스의 소속이 아니라 클래스의 소속이다.
	//생성자는 리턴타입을 정의하지않음
	//generate constructor from superclass
	//기본생성자
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	  //generate constructor using fields
	//인자(파라미터)로로부터 값을 넘겨받는 변수->매개변수의 값들은 힙 메모리의 literal value에 들어있다.
	/*key(16진수 주소값) / value
	 * 100 / 섭섭해
	 * 101 / 24
	 * 102 / 177.6
	 * 103 / M
	 * 이런식으로 담김 ... 실제 매개변수  age값에는 24가 아니라 101이 담긴다*/
	public Person(String name, int age, double height, char gender, boolean isMarried) {
		//얘는 로컬변수이기때문에 이름 동일해도 쓸 수있움
		//this를 줌으로써 가독성을 높임-> 인스턴스를 지칭하는 키워드임. 해당 객체멤버변수에 로컬변수를 할당하라!라는 뜻
		super();
	    this.name = name;//this를 뺄 경우 name=name이된다. 우선순위 멤버변수<지역변수이므로 멤버변수엔 널값이들어간다
	    this.age = age;
	    this.height = height;
	    this.gender = gender;
	    this.isMarried = isMarried;
	  }
	 

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	
	
};
