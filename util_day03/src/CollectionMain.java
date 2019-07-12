import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class CollectionMain {

	public static void main(String[] args) {
		/*List list = new ArrayList();*/ //배열객체를 리스트가 참조하는 것임.
		//이거 말고 꺽쇠로 <String>을 앞에 넣어준다면
		
		//List <String> list = new ArrayList<>(); //컴파일 시점에서 오류가 난다.-> 제너릭스 문법: 타입제한을 할 수 있다.
		//그리고 불필요한 다운캐스팅 줄일 수 있음. 꺼내올떄 다운캐스팅 하지 않고 타입 그대로 나온다.
		
		//List <String> list = new ArrayList<String>(); // 제너릭스 문법이 아님.! 다운캐스팅을 한다.
		
		//여기에 student객체를 넣어도, 꺼내올때는 object가 나온다. 부모에게 접근이 되기때문에 student를 쓸 수 없다. 
		//그래서 casting이 필요하다.
		//불편하기때문에 제너릭스 문법을 사용한다.
		/*list.add("jslim"); 
		list.add(100);
		list.add(true);
		list.add('A');
		list.add(new ExceptionObj());
		*/
		//System.out.println(list);
		//프린트를 하면 변수들의 주소번지가 나와야하는데, 주소번지가 아니라 해당 변수의 값이 나옴. 왜?
		// 객체 클래스에는 toString 오버라이딩하기때문에 자기가 갖고있는 멤버변수를 출력하도록 구현해놓음
		//근데 마지막 객체에는 왜 주소값이 나올까?
		// 이 객체의 맨 위 부모는 obj의 주소를 toString으로 반환하도록 구현했기 때문임
		
		//현장에서는 이렇게 다양한 데이터 타입을 담지 않는다.
		
		/*현장에서 가장 많이 쓰느 배열타입 두개*/
		/*멀티 스레드 환경에서는 Vector를 쓰는 것이 낫다. 데이터의 안정성을 보장할 수 있기 때문*/
		/*servlet jsp로 구현하는 웹->멤버변수를 구현하지 않음*/
		List <String> list = new ArrayList<String>();
		list.add("jslim01");
		list.add("jslim02");
		
		Vector <String> vec = new Vector<String>();
		vec.add("jslim"); 
		
		Map<Integer,List> map = new HashMap<Integer,List>();
		map.put(1, list); map.put(2,vec);
		
		//Map은 랜덤 액세스가 가능하다.-> key 값만 주면  바로 가져올 수 있다.
		
		//iterator()함수 - 인터페이스라서 속도 가장 빠르다!
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}	
		
		
		//map은 이터레이터가 없다. 대신 entry 셋을 쓴다
		//entry셋보다는 key랎을 더 많이 씀...
		//key값이 중복되지 않기 때문에 set에서 관리할  수 있다
		
		
		
		//삽입삭제가 빈번하게 일어나는 리스트라면 linked list를 쓰는것이 좋다.

		
		Set<Integer> set = map.keySet();
		Iterator<Integer> keys = set.iterator();
		while(keys.hasNext()) {
			List<String> result01 = map.get(keys.next());
		}
		

		
		
	}

}
