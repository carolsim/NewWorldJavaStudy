package com.sinc.test.service;

import com.sinc.test.model.vo.TestDTO;
import com.sinc.test.model.vo.TestVO;

public interface TestService {
	//insert update delete를 하면 무조건 리턴타입을 int로 해라.
	public TestVO select(TestDTO dto);
}