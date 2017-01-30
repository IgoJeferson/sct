<!DOCTYPE html>
<%@page import="br.com.fiap.sct.entity.Escola"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Editar Escola</title>
</head>
<body>

	<form action="editarEscola" method="post">
		ID:  ${escola.id} <br/>
		<input type="hidden" name="id" value="${escola.id}"/>
		Nome Escola: <input type="text" name="nmEscola" value="${escola.nome}"/><br />
		Endereço: <input type="text" name="enderecoEscola" value="${escola.endereco}"/><br />
		Telefone: <input type="text" name="telefoneEscola" value="${escola.telefone}"/> <br />
		<input type="submit" value="Editar"/>
	</form>
	
</body>
</html>