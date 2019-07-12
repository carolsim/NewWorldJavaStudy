package com.sinc.ctrl.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sinc.front.view.View;

public interface Controller {
	View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException ;
}