package com.sumwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdditionServlet")
public class AdditionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String fnum=request.getParameter("txtFnum");
		String snum=request.getParameter("txtSnum");
		int f=Integer.parseInt(fnum);
		int s=Integer.parseInt(snum);
		int sum=f+s;
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Sum Page</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("Sum of "+f+ " and "+s+" is : "+sum);
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}

}
