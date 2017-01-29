<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Lista de Cursos</title>
</head>
<body>
	<c:forEach var="curso" items="${lista}">
		${curso.id} / ${curso.nome} / ${curso.escola.nome} <br/>
	</c:forEach>
</body>
</html>