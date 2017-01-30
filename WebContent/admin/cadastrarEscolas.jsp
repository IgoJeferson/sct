<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>SCT - Cadastro de Escolas</title>
	 <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	 <meta charset="utf-8" />
	 <meta name="viewport" content="width=device-width, initial-scale=1"/>
	 <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	 <meta http-equiv="X-UA-Compatible" content="IE=Edge" />
	 <meta http-equiv="Pragma" content="no-cache" />
	 <meta http-equiv="Expires" content="-1" />
	 <meta http-equiv="Cache-Control" content="no-cache" />
	 <link rel="shortcut icon" href="${pageContext.request.contextPath}/imagens/logo.jpg" />
	 <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	 <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
	 <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
	 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sct.css" />

</head>
<body>
	
	<jsp:include page="menu.jsp"></jsp:include>
	<jsp:useBean id="escolaBean" class="br.com.fiap.sct.bean.EscolasBean" />
	
	<div class="container">
		<div class="panel panel-success"> 
			<div class="panel-heading">
				<h5 class="panel-title">
					<span class="glyphicon glyphicon-home"></span>&nbsp;Cadastro de Escolas
				</h5>
			</div>
			<div class="panel-body">
			
				<form action="cadastrarEscola" method="post">
					
  					  <div class="form-group col-md-12">
						  <label class="control-label" for="nome">Nome</label>  
  		 				  <input id="nome" name="nome" type="text" placeholder="Digite o nome da Escola" class="form-control input-md" required maxlength="80" />
  					  </div>
  					  
  					  <div class="form-group col-md-8">
						  <label class="control-label" for="endereco">Endereço</label>  
  		 				  <input id="endereco" name="endereco" type="text" placeholder="Digite o Endereço" class="form-control input-md" required maxlength="100" />
  					  </div>
  					  
  					  <div class="form-group col-md-4">
						  <label class="control-label" for="telefone">Telefone</label>  
  		 				  <input id="telefone" name="telefone" type="text" placeholder="Digite o Nº de Telefone" class="form-control input-md" required maxlength="14" />
  					  </div>
  					  
					  <div class="pull-right">
						<button class="btn btn-primary"><span class="glyphicon glyphicon-saved"></span> Incluir</button>
					  </div>
					    	
				 </form>
		  		<br><br><br><br><br><br><br><br>
		  
		  	<br><br>
			<div class="panel panel-info">
			  <div class="panel-heading">Lista de Escolas</div>
			  <div class="panel-body">
			     <table class="table">
				    <thead>
				    	<tr>
					    	<th>Nome</th>
					    	<th>Endereço</th>
					    	<th>Telefone</th>
					    	<th></th>
					    </tr>	
				    </thead>
				    <tbody>
				    	<c:forEach var="escola" items="${escolaBean.consultarEscolas}">
							<tr>
								<td><c:out value="${escola.nome}"/></td>
								<td><c:out value="${escola.endereco}"/></td>
								<td><c:out value="${escola.telefone}"/></td>
								<td><a href="#"><span class="glyphicon glyphicon-trash"></span></a></td>
								<td><a href="${pageContext.request.contextPath}/admin/editarEscolas.jsp"><span class="glyphicon glyphicon-edit"></span></a></td>
							</tr>
						</c:forEach>
				    </tbody>
				  </table>
			  </div>
			
			</div>
		</div>  
	</div>
	</div>
		
	<script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	
	<script>
		$(function(){
			$('.menu').click(function(){
				$('.menu').removeClass('active');
				$('#menuEscola').addClass('active');
			});
		});
	</script>
</body>
</html>
