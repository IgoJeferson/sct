<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="br.com.fiap.sct.entity.Escola"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.fiap.sct.dao.EscolaDao"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Cursos</title>
</head>
<body>

	<form action="cadCursos">
	<% EscolaDao dao = new EscolaDao();
	List<Escola> listaEscola = new ArrayList<Escola>();
	listaEscola = dao.listar();
	%>
		Escola: <br/>
		<c:forEach items="${listaEscola}" var="esc" >
			 ${esc.id} / ${esc.nome} <br/>
		</c:forEach>
		Nome do curso: <input type="text" name="nome"/>
		
		Disciplina: <input type="text" name="disciplina"/>
		
		
		
	</form>
</body>
</html>