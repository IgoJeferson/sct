<!DOCTYPE html>
<html>
<head>
<title>Editar Escola</title>
</head>
<body>

	<form action="editarEscola" method="post">
		Nome Escola: <input type="text" name="nmEscola" value="${escola.nome}"/><br />
		Endereço: <input type="text" name="enderecoEscola" value="${escola.endereco}"/><br />
		Telefone: <input type="text" name="telefoneEscola" value="${escola.telefone}"/> <br />
		<input type="submit" value="Editar"/>
	</form>

</body>
</html>