<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="br.com.fiap.sct.entity.Escola"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.fiap.sct.dao.EscolaDao"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Cadastro de Cursos</title>
</head>
<body>
	<form action="cadCursos" method="post">	
		Escola:
		<select id="escola" name="escolaSlc" > 
<%
	EscolaDao dao = new EscolaDao();
	List<Escola> listaEscola = new ArrayList<Escola>();
	listaEscola = dao.listar();
	for(int i=0; i<listaEscola.size(); i++ ){
		Escola esc = new Escola();
		esc = (Escola)listaEscola.get(i);
%>
				<option value="<%=esc.getId()%>"><%=esc.getNome()%></option>
<%
	}
%>
</select>
<br/>
		Nome do curso: <input type="text" name="nome"/><br/>
		<input type="submit" value="Adicionar"/>
	</form>
</body>
</html>