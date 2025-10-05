package com.kakeibo.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    response.setContentType("text/html; charset=UTF-8");

	    // 画面に表示するHTML
	    response.getWriter().println("<h1>家計簿アプリへようこそ！</h1>");
	    response.getWriter().println("<p>これは最初のホーム画面です。</p>");
	}

}
