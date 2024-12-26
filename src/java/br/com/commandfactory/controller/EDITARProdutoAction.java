package br.com.commandfactory.controller;

import dao.ProdutoDAO;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;
import model.ProdutoBuilder;

public class EDITARProdutoAction implements ICommand {

    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String msg = "";
        ProdutoDAO pdao = new ProdutoDAO();
        ProdutoBuilder builder = new ProdutoBuilder();
        try {
            int id = Integer.parseInt(request.getParameter("txtid"));
            builder.comId(id);
            Produto produto = builder.constroi();
            Produto prod = pdao.consultarById(produto);
            request.setAttribute("prod", prod);
           
        } catch (ClassNotFoundException | SQLException | NumberFormatException ex) {
            msg = "Erro ao consultar";
            request.setAttribute("msg", msg);
        }
        return "formeditar.jsp";
    }
}
