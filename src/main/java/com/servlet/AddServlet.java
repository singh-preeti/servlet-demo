package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{  
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException   
{  

  int a = Integer.parseInt(req.getParameter("num1"));
  int b = Integer.parseInt(req.getParameter("num2"));
  
  int c = a+b;
  System.out.println("addition is :" +c);
  
  PrintWriter out = res.getWriter();
  out.println("addition is" +c);

}
}  