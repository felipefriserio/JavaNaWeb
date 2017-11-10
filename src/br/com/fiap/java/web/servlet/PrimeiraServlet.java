package br.com.fiap.java.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Jeito antigo de se criar servlets, mapeado no web.xml
 */
public class PrimeiraServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome  = req.getParameter("nome");
		String idade = req.getParameter("idade");
		
		PrintWriter out = resp.getWriter();
		out.println("Servlet 1!");
		out.println("Seu nome eh: "+ nome + " e sua idade eh "+idade);
		out.close();
	}
}
