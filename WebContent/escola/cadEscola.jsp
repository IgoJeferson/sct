<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="cadEscola" method="post">
		Nome Escola: <input type="text" name="nmEscola"/>
		Endereço: <input type="text" name="enderecoEscola"/>
		Telefone: <input type="text" name="telefoneEscola"/> 
		
		<input type="submit" value="Adicionar"/>
		
	</form>
	
	
	
</body>
</html>