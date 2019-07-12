package com.sinc.test.service;

import com.sinc.test.model.sql.TestDao;
import com.sinc.test.model.sql.TestDaoImpl;
import com.sinc.test.model.vo.TestDTO;
import com.sinc.test.model.vo.TestVO;

public class TestServiceImpl implements TestService {
	
	private TestDao dao;
	public TestServiceImpl() {
		dao = new TestDaoImpl();
	}
	
	@Override
	public TestVO select(TestDTO dto) {
		System.out.println("Service select");
		return dao.selectedRow(dto);
	}

}
