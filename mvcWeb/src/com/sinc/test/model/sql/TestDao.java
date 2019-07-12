package com.sinc.test.model.sql;

import com.sinc.test.model.vo.TestDTO;
import com.sinc.test.model.vo.TestVO;

public interface TestDao {
	public TestVO selectedRow(TestDTO dto);
}
