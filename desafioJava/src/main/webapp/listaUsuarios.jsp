<%@ page import="java.util.ArrayList" %>
<%@ page import="br.com.karenrodrigues.model.Usuario" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>) request.getAttribute("usuarios"); %>

<html>
<head>
    <link rel="stylesheet" href="style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300&display=swap" rel="stylesheet">
    <script>
        function confirmar(id) {
            let resposta = confirm("Confirma a exclusão?")
            if (resposta === true) {
                //alert(id)
                window.location.href = "delete?id=" + id;
            }
        }
    </script>
    <title>Lista de cadastros</title>
</head>
<body>
<div id="div-lista">
    <h1>Lista de Cadastros</h1>
    <table id="lista">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Profissão</th>
            <th>Idade</th>
            <th colspan="2">Ações</th>
        </tr>
        </thead>
        <tbody>
        <% for (Usuario usuario : listaUsuarios) { %>
        <tr>
            <td><%= usuario.getNome() %>
            </td>
            <td><%= usuario.getProfissao() %>
            </td>
            <td><%= usuario.getIdade() %>
            </td>
            <td>
                <a href="javascript:confirmar(<%= usuario.getId() %>)">
                    <img src="images/excluir.png" width="20px">
                </a>
            </td>
            <td>
                <a href="select?id=<%= usuario.getId() %>">
                    <img src="images/escrever.png" width="20px">
                </a>
            </td>
        </tr>
        <% } %>
        </tbody>
    </table>
    <br>
    <a href="cadastro.jsp"><input type="button" value="Novo cadastro" class="btn-lista"></a>
</div>
<br>
</body>
</html>
