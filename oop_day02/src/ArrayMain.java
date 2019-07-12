
public class ArrayMain {
	public static void main(String[] args) {
		int [] intAry = null ;
		intAry = new int [26];//배열객체가 하나 만들기
		//instance 생성하게되면 이 변수를 어느 영역에 생성해야할지 고민해야할 시기임.
		setAry(intAry);
		printAry(intAry);
		setAlpha(intAry);
		printAlpha(intAry);
	}
	public static void setAry(int [] ary) {
		// instance 생성 이후 생성이 되는것-> static
		// java는 call by value와 call by reference가 있음. 지금은 call by refernce임.
		
		for(int idx = 0 ; idx< ary.length; idx++) {
			ary[idx] = (int)(Math.random()*100)+1;//class에서 쓰는 함수이므로 static함수이다.
			
		}
		
	}
	public static void printAry(int []ary) {
		/*iterator방식 for-each loop*/
		for(int value: ary) {// colon오른쪽에는 collection. 왼쪽에는 그 컬렉션이 갖고있는 타입.
			System.out.println(value); //System의 out 클래스에 있는 static 함수!
		}
	}
	public static void setAlpha(int [] ary) {
		for(int idx=0;idx<ary.length;idx++) {
			ary[idx]='A'+idx;
		}
	}
	public static void printAlpha(int [] ary) {
		for(int value : ary) {
			System.out.println(((char)value));
		}
	}
}
