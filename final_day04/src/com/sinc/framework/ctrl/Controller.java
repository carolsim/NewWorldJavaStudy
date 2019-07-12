package com.sinc.framework.ctrl;

import java.util.List;

import com.sinc.oop.sup.model.vo.PersonVO;

public interface Controller {
	public List<PersonVO> execute();
	public Object execute(Object obj);
	
}
