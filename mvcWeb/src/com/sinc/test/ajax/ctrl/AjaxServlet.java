package com.sinc.test.ajax.ctrl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.sinc.test.model.vo.TestDTO;


@WebServlet("/ajaxCtrl")
public class AjaxServlet extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AjaxServlet doPost");
		System.out.println(request.getParameter("ssn"));
		///////////////////////////////////////
		TestDTO dto = new TestDTO("jssim","jssim");
		JSONObject jObj = new JSONObject(dto);
		
		response.setContentType("text/html;charset=UTF8");
		PrintWriter out = response.getWriter();
		out.print(jObj.toString());
		out.close();
	}

}
