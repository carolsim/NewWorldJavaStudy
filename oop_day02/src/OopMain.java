import com.sinc.oop.sub.model.vo.EmployeeVO;
import com.sinc.oop.sub.model.vo.StudentVO;
import com.sinc.oop.sub.model.vo.TeacherVO;
import com.sinc.oop.sup.model.vo.PersonVO;

public class OopMain {

	public static void main(String[] args) {
		/* 은닉화 추상화 상속성 다형성
		 * 
		 * 
		 * 배열의 특징 ([])
		 * 객체로 취급된다
		 * 고정길이 fixed size
		 * same type -같은 사이즈만 담을 수 있다.
		 * index는 0부터 시작된다
		 * length라는 속성(field)을 쓸 수 있다.
		 * 
		 * [] intAry ->변수명! 배열타입의 변수이다. 근데 배열은 객체 취급이기 때문에 뒤에 new [10](초기화)를 해줘야함
		 * 여기에 int를 담는 Array를 만들고싶다..
		 * 그럼 int[] intAry = new int[10] 요렇게 하면됨
		 * Student[] stuAry = new stu[10]
		 * intAry[0] ='A'가 들어갈 수 있다. 형변환이 일어나서 아스키코드값으로 들어감
		 * 
		 * int [] intAry= new int[] ->동적으로 쓸 수 있음
		 * 
		 * 
		 * */
		
		PersonVO [] perAry = new PersonVO [40];
		
		PersonVO stu = new StudentVO(1,"김지원",25,"논현","2014");//이렇게해도 되긴된다. 부모의 객체에 자식 객체를 넣기
		PersonVO tec = new TeacherVO(2,"섭섭해",35,"논현","자바");
		PersonVO emp = new EmployeeVO(3,"유미소",30,"논현","인사팀");
		System.out.println(((StudentVO)stu).stuInfo());//근데 이렇게
		System.out.println(((TeacherVO)tec).subInfo());
		System.out.println(((EmployeeVO)emp).deptInfo());
		System.out.println(stu instanceof PersonVO);
		
		perAry[0]=stu; perAry[1]=tec; perAry[2]=emp; //배열에 담음. 근데 다운캐스팅안됨, 타입캐스팅 직접 해줘야함.
		
		/*outer라고 반복문의 라벨링을 준다*/
		outer : for(int idx=0;idx<perAry.length;idx++) {
			PersonVO per = perAry[idx]; //배열의 타입이 Person이므로 Person변수에 넣음
			//per는 Person타입이므로 student변수로 다운캐스팅해줘야한다.
			/*if(per instanceof StudentVO) {
				System.out.println(((StudentVO)per).stuInfo());
			}
			if(per instanceof TeacherVO) {
				System.out.println(((TeacherVO)per).subInfo());
			}
			if(per instanceof EmployeeVO) {
				System.out.println(((EmployeeVO)per).deptInfo());
			}*/
			if(per==null) {
				break outer;//outer라고 라벨링된 반복문을 나간다
			}
			System.out.println(per.perInfo());
		}
		
		System.out.println("~~ END");
	}

}
