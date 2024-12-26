<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
        <link rel="stylesheet" href="principal.css"/>
        <link rel="stylesheet" href="tabela.css">
    </head>
    
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
    
    <body>
        <%String msg = (String) request.getAttribute("msg");%>
        <header>
            <h1><%out.print(msg);%></h1>  
        </header>
    </body>
</html>