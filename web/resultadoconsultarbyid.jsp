<%@page import="model.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado Consultar By Id</title>
        <link rel="stylesheet" href="principal.css"/>
        <link rel="stylesheet" href="tabela.css">
    </head>
    
    <body>
        <header>
            <h1> PC </h1>
        </header>
        
        <nav>
            <a href="index.html">Inicio</a>
            <a href="cadastro.html">Cadastro de produtos</a>
            <a href="alterar.html">Alterar Produtos</a> 
            <a href="deletar.html">Excluir Produtos</a> 
            <a href="consultar.html">Consultar um Produto</a> 
            <a href="ManterProduto?btnop=CONSULTARTODOS">Listar Todos os Produtos</a>
        </nav>
        
        <header>
            <h1>Resultado da Consulta Pelo ID</h1>
        </header>
        
        <table>
            <tr>
                <th>Id</th>
                <th>Processador</th>
                <th>Cooler</th>
                <th>Placa de Video</th>
                <th>Placa Mãe</th>
                <th>Memoria Ram</th>
                <th>Armazenamento</th>
                <th>Gabinete</th>  
                <th>Fonte</th>  
                <th>Monitor</th>
                <th>Teclado</th>       
                <th>Alterar</th>
                <th>Excluir</th>
            </tr>   
        
         <%Produto prod = (Produto) request.getAttribute("prod");%>

         <%
            if (prod.getProcessador() != null) {
        %>
            
            <tr>
                <td><%= (prod.getId())%></td>
                <td><%= (prod.getProcessador())%></td>
                <td><%= (prod.getCooler())%></td>
                <td><%= (prod.getPlacadevideo())%></td>
                <td><%= (prod.getPlacamae())%></td>
                <td><%= (prod.getMemoriaram())%></td>
                <td><%= (prod.getArmazenamento())%></td>
                <td><%= (prod.getGabinete())%></td>
                <td><%= (prod.getFonte())%></td>
                <td><%= (prod.getMonitor())%></td>
                <td><%= (prod.getTeclado())%></td>       
                <td> <a href="ManterProduto?btnop=EDITAR&txtid=<%= (prod.getId())%>"><img src="imagens/editar.png" width="50" height="50"></a></td>
                <td> <a href="ManterProduto?btnop=DELETAR&txtid=<%= (prod.getId())%>"><img src="imagens/excluir.png" width="50" height="50"></a>
            </tr>
            
            <%} else {%>
            <header>
                ID NÃO ENCONTRADO
            </header>
            <%}%>
        
    </body>
</html>