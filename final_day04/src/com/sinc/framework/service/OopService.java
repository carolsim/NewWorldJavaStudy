package com.sinc.framework.service;

import java.util.List;

public interface OopService {
	/*메서드의 유형을 지정해줌*/
	
	public void			insert(Object obj); //지금은 이렇게 하지만 웹에서는 무조건 타입을 하나 넘겨줘야함
	public List<Object>	select();
	
	public Object		search(Object name);
	public Object		delete(Object name);
	
	
	
	
	
	
	
}
