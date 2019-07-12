import com.sinc.cal.Calc;

public class CalMain {

	public static void main(String[] args) {
		
		Calc cal = new Calc();
		int sum = cal.calcSum(100,97,80,70);
		double avg = sum/4.0;
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
		if (avg>=90) System.out.println("A학점");
		else if (avg>=70 && avg<90) System.out.println("B학점");
		else if (avg>=50 && avg<70) System.out.println("C학점");
		else if (avg>=30 && avg<50) System.out.println("D학점");
		else System.out.println("F학점");
		

	}

}
