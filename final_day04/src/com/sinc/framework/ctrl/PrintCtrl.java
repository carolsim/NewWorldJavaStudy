package com.sinc.framework.ctrl;

import java.util.List;

import com.sinc.framework.service.OopService;
import com.sinc.framework.service.OopServiceImpl;
import com.sinc.oop.sup.model.vo.PersonVO;

public class PrintCtrl implements Controller {
	
	
	private OopService service;
	public PrintCtrl() {
		service = new OopServiceImpl();
	}
	
	@Override
	public List<PersonVO> execute() {
		// TODO Auto-generated method stub
		return (List)service.select();//PersonVo타입의 리스트를 반환해야하는데object타입 리턴하고 있기 때문
	}

	@Override
	public Object execute(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
