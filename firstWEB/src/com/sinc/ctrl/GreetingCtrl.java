package com.sinc.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//사용자가 greeting.do를 호출할때 브라우저가 콜하는 콘트롤러
@WebServlet("/greeting.do")
public class GreetingCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
	}


	public void destroy() {
		System.out.println("destroy()");
	}

/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<font color='red'>집에 가고 싶다... . .  .   .     .      .따 흐 흐 흑</font>");
		out.close();
	}
	*/

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		
		//Redirect방식(요청 재지정. url자체가 바뀜)과 Forward방식 두개가 있음
		
		//response.sendRedirect("/greeting.jsp"); //url path에서 현재 디렉토리 ./와 /는 완전 다른의미  ./는 아예없는것과 같음. ""=="./" 아예 맨 처음으로 돌아가는거임.
		
		RequestDispatcher view = request.getRequestDispatcher("/greeting.jsp");
		//원래request에 대해 다른 response가 일어난것임
		view.forward(request,response);
	}
	
	
}
