package com.sinc.framework.ctrl;

import java.util.List;

import com.sinc.framework.service.OopService;
import com.sinc.framework.service.OopServiceImpl;
import com.sinc.oop.sup.model.vo.PersonVO;

public class SearchCtrl implements Controller{
	
	private OopService service;
	public SearchCtrl() {
		service = new OopServiceImpl();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<PersonVO> execute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object execute(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
