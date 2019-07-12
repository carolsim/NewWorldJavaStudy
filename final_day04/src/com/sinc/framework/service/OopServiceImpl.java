package com.sinc.framework.service;

import java.util.List;

import com.sinc.framework.model.sql.Dao;
import com.sinc.framework.model.sql.OracleDaoImpl;

public class OopServiceImpl implements OopService {
	
	//원래는 factory를 만들어서 싱글톤으로 관리를 해줘야하지만 일단 우선.....지금은 코드상의 흐름만 이해하자
	//서비스가 dao를 생성하고.. 블라블라 매커니즘만 이해
	
	/*DAO가 있어야한다*/
	//private List<PersonVO> list ;
	private Dao dao;
	
	public OopServiceImpl() {
		//list = new ArrayList<PersonVO>();//제어의 역행을 한다면 이 라인의 코딩이 없어진다. 객체생성 안하고 변수만 주입함.
		
		dao = new OracleDaoImpl();
	}

	@Override
	public void insert(Object obj) {
		System.out.println("service insert");
		dao.insertRow(obj);
	}

	@Override
	public List<Object> select() {
		System.out.println("service select");
		return dao.selectRow();
	}

	@Override
	public Object search(Object name) {
		System.out.println("service search");
		return dao.selectPkRow();
	}

	@Override
	public Object delete(Object obj) {
		System.out.println("service delete");
		return dao.deleteRow(obj);
	}

}
