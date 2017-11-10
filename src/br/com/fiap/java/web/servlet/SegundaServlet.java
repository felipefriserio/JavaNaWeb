package br.com.fiap.java.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/* 
 * Jeito novo para se mapear servlet, mapeado com anotacoes
 * A partir do Dynamic Web Module 3.0 eh possivel mapear
 * as servlets pelo @WebServlet("NOME_SERVLET")
*/
@WebServlet("/segundaServlet")
public class SegundaServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome  = req.getParameter("nome");
		String idade = req.getParameter("idade");
		
		PrintWriter out = resp.getWriter();
		out.println("Servlet 2!");
		out.println("Seu nome eh: "+ nome + " e sua idade eh "+idade);
		out.close();
	}
}
