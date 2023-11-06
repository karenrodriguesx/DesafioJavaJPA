<%--
  Created by IntelliJ IDEA.
  User: karen.rodrigues
  Date: 11/10/2023
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300&display=swap" rel="stylesheet">
    <title>Cadastro</title>
</head>
<body>
<div id="form-cadastro">
    <form method="get" action="insert">
        <h2>Cadastro</h2>
        <label for="nome">Nome </label><input type="text" class="input-text" name="nome" required><br>
        <label for="profissao">Profissão </label><input type="text" class="input-text" name="profissao" required><br>
        <label for="idade">Idade </label><input type="number" class="input-text" name="idade" required><br>
        <div id="botoes">
            <input type="submit" value="Cadastrar" class="btn-form">
            <a href="listaUsuarios"><input type="button" value="Listar" class="btn-form"></a></div>
    </form>
</div>
</body>
</html>
