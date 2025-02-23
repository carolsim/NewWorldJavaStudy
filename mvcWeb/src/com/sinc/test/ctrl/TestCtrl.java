package com.sinc.test.ctrl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sinc.ctrl.command.Controller;
import com.sinc.front.view.View;
import com.sinc.test.model.vo.TestDTO;
import com.sinc.test.model.vo.TestVO;
import com.sinc.test.service.TestService;
import com.sinc.test.service.TestServiceImpl;

public class TestCtrl implements Controller{
	private TestService service;
	
	public TestCtrl() {
		service = new TestServiceImpl();
	}
	
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestCtrl execute");
		View view = new View();
		
//		if(true) {
//			request.setAttribute("msg", "짱!!~~~ 섭섭님");
//			view.setPath("success.jsp");
//			view.setSend(true);
//		} else {
//			request.setAttribute("msg", "짱!!~~~ 섭섭님");
//			view.setPath("error.jsp");
//			view.setSend(false);
//		}
		
		///////////////////////
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println("Param id : " + id + " / param pwd : " + pwd);

		TestDTO dto = new TestDTO(id, pwd);
		
		///////////////////////

		TestVO vo = service.select(dto);
		if(vo == null) {
			view.setPath("error.jsp");
			view.setSend(true);
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("testSession", vo);
			
			////////////////////////////
			List<TestVO> list = new ArrayList<>();
			list.add(new TestVO("1","1","1","1", 100));
			list.add(new TestVO("2","2","2","2", 100));
			request.setAttribute("list", list);
			System.out.println(list);
			
			view.setPath("success.jsp");
			view.setSend(true);
		}
		
		return view;
	}


}
