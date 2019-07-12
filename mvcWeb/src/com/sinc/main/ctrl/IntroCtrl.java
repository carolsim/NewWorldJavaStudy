package com.sinc.main.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sinc.ctrl.command.Controller;
import com.sinc.front.view.View;

public class IntroCtrl implements Controller {

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("IntroCtrl execute");
		return new View("main.jsp",true);
	}

}
