package kr.bit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.mem.Helper;

public class HelloServlet extends HttpServlet { // 서블릿(웹에서 구동되는 100%자바로된 웹프로그래밍)
	// JavaEE -> service, doGet, doPost
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		Helper h=new Helper();
		int sum=h.hap();
		// 구한 sum의 값이 요청한 클라이언트에게 응답해주면 된다. (프리젠테이션로직)
		PrintWriter out=res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.print(sum);
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
