package com.sinc.front.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sinc.ctrl.factory.BeanFactory;
import com.sinc.ctrl.command.Controller;
import com.sinc.front.view.View;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestProc(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestProc(request,response);
	}
	
	protected void requestProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String clientUri = request.getRequestURI();
		System.out.println("client : "+clientUri);
		BeanFactory factory = BeanFactory.getInstance();
		Controller ctrl = factory.getCtrl(clientUri);
		View view = ctrl.execute(request,response);
		if(view.isSend()) {
			RequestDispatcher rd = request.getRequestDispatcher(view.getPath());
			rd.forward(request, response);
		}else {
			response.sendRedirect(view.getPath());
		}
	}

}
 