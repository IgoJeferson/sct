<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="escola" class="br.com.fiap.sct.bean.EscolaBean" />

		<c:forEach items="${escola.listaEscolas}" var="escola">
			<div>${escola.nome} / ${escola.endereco} / ${escola.telefone}</div>
		</c:forEach>

</body>
</html>