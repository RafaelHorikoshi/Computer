package br.com.commandfactory.controller;

import dao.ProdutoDAO;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;

public class CONSULTARTODOSProdutoAction implements ICommand {

    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ProdutoDAO pdao = new ProdutoDAO();
        try {
            List<Produto> lprod = pdao.consultarTodos();
            request.setAttribute("lprod", lprod);
            
        } catch (ClassNotFoundException | SQLException | NumberFormatException ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }
        return "resultadoconsultartodos.jsp";
    }
}
