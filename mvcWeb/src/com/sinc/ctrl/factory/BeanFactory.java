package com.sinc.ctrl.factory;

import java.util.HashMap;
import java.util.Map;

import com.sinc.ctrl.command.Controller;
import com.sinc.main.ctrl.IntroCtrl;
import com.sinc.test.ajax.ctrl.AjaxCtrl;
import com.sinc.test.ctrl.TestCtrl;


public class BeanFactory {
	private static BeanFactory instance;
	private Map<String, Controller> map;
	
	private BeanFactory() {
		map = new HashMap<>();
		map.put("/test.do",new TestCtrl());
		map.put("/main.do",new IntroCtrl());
		map.put("/ajax.do",new AjaxCtrl());

	}
	public static BeanFactory getInstance() {
		if(instance==null) {
			instance = new BeanFactory();
		}
		return instance;
	}
	public Controller getCtrl(String action) {
		return map.get(action);
	}
}
