<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Shows</title>
</head>
<body>
	<h1 class="text-center">Usuário</h1>
	<table>
		<tr>
			<th>ID</th>
			<th>Nome</th>
			<th>Sobrenome</th>
			<th>E-mail</th>
			<th>Telefone</th>
			<th colspan="2">Action</th>
		</tr>
		<c:forEach var="usuario" items="${usuario}">
			<tr>
				<td>${usuario.id}</td>
				<td>${usuario.nome}</td>
				<td>${usuario.sobrenome}</td>
				<td>${usuario.email}</td>
				<td>${usuario.telefone}</td>
				<td><a href="${atualizar}${usuario.id}"
					onclick="return confirm('Deseja alterar esse produto?');">Atualizar</a></td>
				<td><a href="${deletar}${usuario.id}"
					onclick="return confirm('Deseja deletar esse produto?');">Deletar</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<hr />
	<h1>Cadastrar Usuários</h1>
	<hr />
	<form:form action="${salvar}" modelAttribute="usuario">

		<form:hidden path="id" />

		<label>Nome</label>
		<br />
		<form:input path="nome" />

		<br />

		<label>Sobrenome</label>
		<br />
		<form:input path="sobrenome" />

		<br />

		<label>E-mail</label>
		<br />
		<form:input path="email" />

		<br />

		<label>Telefone</label>
		<br />
		<form:input path="telefone" />

		<br />

		<label>Senha</label>
		<br />
		<form:hidden path="senha" />

		<br />
		<br />

		<form:button>${usuario.id == 0 ? 'Cadastrar' : 'Atualizar'}</form:button>
	</form:form>
	<hr/>
	<button onclick='location.href=<spring:url value="/" />;'>Voltar</button>

</body>
</html>