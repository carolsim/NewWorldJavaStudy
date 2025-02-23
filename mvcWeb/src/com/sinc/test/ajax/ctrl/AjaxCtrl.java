package com.sinc.test.ajax.ctrl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import com.sinc.ctrl.command.Controller;
import com.sinc.front.view.View;
import com.sinc.test.model.vo.ChartVO;

public class AjaxCtrl implements Controller {

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ajax ctrl");
		
		//TestDTO dto = new TestDTO("jssim","jssim");
		//JSONObject jObj = new JSONObject(dto);
		//request.setAttribute("scriptObj", jObj.toString());//request에 dto가 아니라 jobj를 심은것
		
		
		//차트 정보를 넘겨봊아
		List<ChartVO> list = new ArrayList<>();
		list.add(new ChartVO("2019",50,100,200));
		list.add(new ChartVO("2010",1150,100,200));
		list.add(new ChartVO("2015",50,2000,200));
		
		JSONArray jAry = new JSONArray(list);
		request.setAttribute("scriptObj", jAry.toString());
	
		
		return new View("ajaxChart.jsp",true);
	}
	
}
