package com.sinc.oop.factory.singleton;

import com.sinc.oop.util.TV;
import com.sinc.tv.model.vo.LTV;
import com.sinc.tv.model.vo.STV;

/*TV관리하는 공장 클래스*/
public class TVFactory {
	
	private static TVFactory instance = null;
	private TV[] ary;
	
	private TVFactory() {
		ary = new TV[2];
		ary[0] = new LTV();
		ary[1] = new STV();
	}
	/*TVMain이 필요한 TV...
	 * TV는 인터페이스인데 이렇게 리턴을 시킬 수 있음? ㅇㅇ 지금 TV를 타입으로 선언했기때문*/
	public TV getTV(String brand) {
		return (brand.contentEquals("samsung") ? ary[0] : ary[1]);
	}
	public static TVFactory getInstance() {
		if(instance==null) {
			instance = new TVFactory();
		}
		return null;
	}
	
	
}
