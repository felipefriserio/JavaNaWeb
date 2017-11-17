<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="acesso" class="br.com.fiap.java.web.bean.DadosAcessoUsuario" scope="session">
	<jsp:setProperty name="acesso" property="*"/>
</jsp:useBean>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% 
		System.out.println(acesso.getDataPrimeiroAcesso());
		System.out.println(acesso.getDataUltimoAcesso());
	%>

</body>
</html>