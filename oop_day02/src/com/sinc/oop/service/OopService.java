package com.sinc.oop.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sinc.oop.sup.model.vo.PersonVO;

public class OopService {

	private List<PersonVO> perList ;
	
	
	public OopService() {
		perList = new ArrayList<PersonVO>();
		
	}
	/* 만약 다형성이 없었더라면 - 모두 다 오버로딩으로 구현
	public void setAry(StudentVO stu) {
		perAry[idx++] = stu;
	}
	
	public void setAry(TeacherVO tec) {
		perAry[idx++] = tec;
	}
	
	public void setAry(EmployeeVO emp) {
		perAry[idx++] = emp;
	}
	*/
	/* 자식타입은 부모타입으로 프로모션될 수 있기때문에 - 다형성
	 * 메서드 오버라이딩을 사용
	 * */
	public void setList(PersonVO per) {
		perList.add(per);
	}
	
	public List<PersonVO> getList() {
		return perList;
	}
	public PersonVO searchBiz(String name) {
		Iterator<PersonVO> ite = perList.iterator();
		while(ite.hasNext()) {
			PersonVO p = ite.next();
			if((p.getName()).equals(name)) return p;
			else return null;
		}
		return null;
	}
	public boolean deleteBiz(String name) {
		Iterator<PersonVO> ite = perList.iterator();
		while(ite.hasNext()) {
			if((ite.next().getName()).equals(name)) {
				ite.remove();
				return true;
			}
			else return false;
		}
		return false;
	}
}
