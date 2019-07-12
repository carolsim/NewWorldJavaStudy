package com.sinc.framework.model.sql;

import java.util.List;

public interface Dao {
	//제너릭하게 리스트에 담는다
	public List<Object> selectRow();
	//싱글파인더는 콜렉션으로 넘길 필요가 없움. 하나만 넘기기때문
	public Object selectPkRow();
	public int insertRow(Object obj);
	public int updateRow(Object obj);
	public int deleteRow(Object obj);
	//이 모든걸 분기하는 역할은 콘트롤러가 한다
	
	
	
}
