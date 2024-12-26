package controller;

import br.com.commandfactory.controller.ICommand;
import dao.ProdutoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;

@WebServlet(name = "ManterProduto", urlPatterns = {"/ManterProduto"})
public class ManterProduto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
 
            ProdutoDAO pdao = new ProdutoDAO();
            Produto p = new Produto();

            try {
                String paramAction = request.getParameter("btnop");
                
                String nomeDaClasse = "br.com.commandfactory.controller."+paramAction+"ProdutoAction";
                Class classAction = Class.forName(nomeDaClasse);                
                ICommand commandAction = (ICommand) classAction.newInstance();
                
                String pageAction = commandAction.executar(request, response);
                request.getRequestDispatcher(pageAction).forward(request, response);
            } catch (Exception e) {
                String msg = "Erro Genérico" + e;
                request.setAttribute("msg", msg);
                request.getRequestDispatcher("resultado.jsp").forward(request, response);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}