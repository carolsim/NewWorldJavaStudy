package com.sinc.oop.view;

import java.util.List;
import java.util.Scanner;

import com.sinc.oop.service.OopService;
import com.sinc.oop.sub.model.vo.EmployeeVO;
import com.sinc.oop.sub.model.vo.StudentVO;
import com.sinc.oop.sub.model.vo.TeacherVO;
import com.sinc.oop.sup.model.vo.PersonVO;

public class OopView {
	
	private OopService service;
	public OopView() {
		/*생성자를 서비스 합니다*/
		service = new OopService();
	}
	public void mainMenu() {
		while(true) {
			System.out.println("1. 객체생성");
			System.out.println("2. 전체출력");
			System.out.println("3. 찾기");
			System.out.println("4. 삭제");
			System.out.println("5. 수정");
			System.out.println("99. 시스템 종료");
			System.out.print("Input Number : ");
			
			Scanner scan = new Scanner(System.in);//스트림이 만들어졌다 - 데이터를 입력받을 수 있는
			int number = 0 ;
			String name ;
			try{
				number = scan.nextInt();//콘솔로부터 입력된 정수값을 넘겨줌      //scan.을 치면 여러가지의 메소드가 나온다.
			} catch(Exception e) {
				scan.nextLine();
				System.out.println("잘못된 값 입력");
				continue;
			} finally {
				switch(number) {
				case 1 : register(); break;
				case 2 : printAll(); break;
				case 3 : 
					System.out.println("이름 입력:");
					name = scan.nextLine();
					search(name); break;
				case 4 : 
					System.out.println("이름 입력:");
					name = scan.nextLine();
					delete(name); break;
				case 99 : System.exit(1);
				default : System.out.println("check your input number");
			}
			
			
			
			}
			
			
		}
	}
	/*
	 * 자바 8버젼은 거의 안씀.. 현업에서는 6버젼을 주로 쓴다. 따라서 최신업뎃 함수를 쓸 수 없다.
	 * lamda enum... 현업에선 못씀
	 * java6에서...switch case는 byte short int char만 가능
	 * 
	 * */
	public void register() {
		while(true) {
			System.out.println("1. 학생");
			System.out.println("2. 강사");
			System.out.println("3. 직원");
			System.out.println("4. 상위메뉴");
			
			Scanner scan = new Scanner(System.in);//스트림이 만들어졌다 - 데이터를 입력받을 수 있는
			int number = 0;
			try {
				number = scan.nextInt();//콘솔로부터 입력된 정수값을 넘겨줌      //scan.을 치면 여러가지의 메소드가 나온다.
			} catch (Exception e) {
				scan.hasNextLine();
				System.out.println("잘못된 값 입력");
				continue;
			}
			finally {
				switch(number) {
				case 1 : case 2 : case 3 : register_proc(number); break;
				case 4 : return;
				/*break는 반복문, return은 메소드를 빠져나가는 것이다*/
				default : System.out.println("check your input number");
			}
			
			
			}
			
		}
		
	}
	public void printAll() {
		
		List <PersonVO> perList = service.getList();
		System.out.println("^*^ 전체 출력 ^*^");
		for(PersonVO per : perList) {
			if(per==null) {
				break;
			} else{System.out.println(per.perInfo());
			}
		}
	}
	
	public void register_proc(int number) {
		System.out.println("^*^ 객체 생성 ^*^");
		//format이라는 건 형식을 먼제 정해주면됨. 포맷의 개수만큼 인풋값이 인덱스로 매칭된다.
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = scan.nextLine();//nextline은 공백을 일일 수 있음
		int age = 0;
		while(true) {
			System.out.println("나이 : ");
			
			try {
				age = scan.nextInt();
			} catch (Exception e) {
				scan.hasNextLine();
				System.out.println("잘못된 값 입력");
				continue;
			} finally {
				break;
			}
		}
		
		
		System.out.println("주소 : ");
		String address = scan.nextLine();
		
		PersonVO per = null;
		String comm = null;
		
		switch(number) {
			case 1 :
				System.out.println("학번 : ");
				comm = scan.nextLine();
				per = new StudentVO(number, name, age, address, comm);
				break;
			case 2 :
				System.out.println("과목 : ");
				comm = scan.nextLine();
				per = new TeacherVO(number, name, age, address, comm);
				break;
			case 3 :
				System.out.println("부서 : ");
				comm = scan.nextLine();
				per = new EmployeeVO(number, name, age, address, comm);
				break;
		}
		
		service.setList(per);
	}
	public void search(String name) {
		/*
		 * 콘솔로부터 이름을 입력받아서 service.searchBiz(name) PersonVO 타입의 객체정보를 받아서 출력하고
		 * 해당 이름으로 검색되는 정보가 없을 경우 "Could not found()"를 출력하라.
		 * */
		
		PersonVO per = new PersonVO();
		per = service.searchBiz(name);
		if(per==null) {
			System.out.println("Could not found()");
		}else {
			System.out.println(per.perInfo());
		}
		
		
	}
	public void delete(String name) {
		/*
		 * 콘솔로부터 이름을 입력받아서 service.deleteBiz(name) boolean 리턴타입의 정보를 받아서
		 * 삭제완료 됐으면 true, 아닌경우 false를 넘겨
		 * 해당 이름으로 검색되는 정보가 없을 경우 "Record not found()"를 출력하라
		 * */
		boolean bool = service.deleteBiz(name);
		if(bool) {
			System.out.println("삭제완료");
		}else {
			System.out.println("Record not found()");
		}
	}
	
	
	
	
}
