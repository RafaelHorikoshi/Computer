<%@page import="model.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulário Editar</title>
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
        <h1>Formulário Editar</h1>
        </header>
        
        <h2>
            <%Produto prod = (Produto) request.getAttribute("prod");%>

            <%
                if (prod.getProcessador() != null) {
            %>

            <div>
                <form action="ManterProduto" method="GET">
                    <table>
                        <tr>
                            <input type="text" name="txtid" placeholder="Digite ID" class="tabelacadastro" readonly value="<%out.println(prod.getId());%>"><BR>
                        </tr>

                        <tr>
                            <input type="text" name="txtprocessador" placeholder="Digite o processador" class="tabelacadastro" value="<%out.println(prod.getProcessador());%>"><BR>
                        </tr>

                        <tr>
                            <input type="text" name="txtcooler" placeholder="Digite o cooler" class="tabelacadastro" value="<%out.println(prod.getCooler());%>"><BR>
                        </tr>

                        <tr>
                            <input type="text" name="txtplacadevideo" placeholder="Digite a placa de video" class="tabelacadastro" value="<%out.println(prod.getPlacadevideo());%>"><BR>
                        </tr>

                        <tr>
                            <input type="text" name="txtplacamae" placeholder="Digite a placa mãe" class="tabelacadastro" value="<%out.println(prod.getPlacamae());%>"><BR>
                        </tr>

                        <tr>
                            <input type="text" name="txtmemoriaram" placeholder="Digite a memoria ram" class="tabelacadastro" value="<%out.println(prod.getMemoriaram());%>"><BR>
                        </tr>

                        <tr>
                            <input type="text" name="txtarmazenamento" placeholder="Digite o armazenamento" class="tabelacadastro" value="<%out.println(prod.getArmazenamento());%>"><BR>
                        </tr>

                        <tr>
                            <input type="text" name="txtgabinete" placeholder="Digite o gabinete" class="tabelacadastro" value="<%out.println(prod.getGabinete());%>"><BR>
                        </tr>

                        <tr>
                            <input type="text" name="txtfonte" placeholder="Digite a fonte" class="tabelacadastro" value="<%out.println(prod.getFonte());%>"><BR>
                        </tr>

                        <tr>
                            <input type="text" name="txtmonitor" placeholder="Digite o monitor" class="tabelacadastro" value="<%out.println(prod.getMonitor());%>"><BR>
                        </tr>

                        <tr>
                            <input type="text" name="txtteclado" placeholder="Digite o teclado" class="tabelacadastro" value="<%out.println(prod.getTeclado());%>"><BR>
                        </tr>
                        
                        <input type="submit" name="btnop" value="ATUALIZAR" class="botao">

                    <%} else {%>
                    ID NÃO ENCONTRADO
                    <%}%>
                </form>
            </div>
        </h2>
    </body>
</html>