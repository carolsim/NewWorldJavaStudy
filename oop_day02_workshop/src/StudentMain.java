import com.sinc.student.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student [] stu = new Student [3];
		stu[0] = new Student("Kim",100,90,95,89);
		stu[1] = new Student("Lee",60,70,99,98);
		stu[2] = new Student("Park",68,86,60,40);
		
		for(Student value: stu) {
			System.out.println(value);
		}
		
	}	

}
