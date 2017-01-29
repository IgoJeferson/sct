<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Lista de Escolas</title>
</head>
<body>

		<c:forEach items="${listaEscolas}" var="escola">
			<div>${escola.nome} / ${escola.endereco} / ${escola.telefone} / <a href="editarEscola?codigo=${escola.id}">Editar</a>/<a href="excluir?codigo=${escola.id}">Excluir</a></div>
		</c:forEach>

</body>
</html>