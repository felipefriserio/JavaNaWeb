<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:useBean id="contato" class="br.com.fiap.java.web.bean.ContatoBean" scope="session">
	<%-- <jsp:setProperty name="nome" property="nome" param="Nome"/> --%>
	<jsp:setProperty name="contato" property="*"/>
	
</jsp:useBean>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%	
	// equivalente a salvar no banco
	System.out.println(contato.toString());
%>
</body>
</html>