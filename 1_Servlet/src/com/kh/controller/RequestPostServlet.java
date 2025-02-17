package com.kh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestPostServlet
 */
@WebServlet("/test2.do")
public class RequestPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestPostServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		System.out.println("잘 실행되니");
		
		String name = request.getParameter("name"); // 텍스트박스가 비어있는 경우 빈 문자열("")로 넘어온다.
		String gender = request.getParameter("gender"); // 라디오버튼의 경우 체크된 값이 없을때 빈 문자열이 아닌 null이 넘어간다.
		int age = Integer.parseInt(request.getParameter("age")); // 반환값이 무조건 문자열이기 때문에 형변환 해줘야함.
		
		String city = request.getParameter("city");
		double height = Double.parseDouble(request.getParameter("height")); // "160" -> 160.0
		
//		체크박스처럼 복수개의 정보를 받을때는 배열형태로 받아야함.
		String[] foods = request.getParameterValues("food");
	}

}
