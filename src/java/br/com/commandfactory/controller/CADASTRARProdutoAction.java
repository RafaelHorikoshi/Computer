package br.com.commandfactory.controller;

import dao.ProdutoDAO;
import java.sql.SQLException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;
import model.ProdutoBuilder;

public class CADASTRARProdutoAction implements ICommand {

    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String msg = "";
        ProdutoDAO pdao = new ProdutoDAO();
        ProdutoBuilder builder = new ProdutoBuilder();
        try {

            String processador = request.getParameter("txtprocessador");
            String cooler = request.getParameter("txtcooler");
            String placadevideo = request.getParameter("txtplacadevideo");
            String placamae = request.getParameter("txtplacamae");
            String memoriaram = request.getParameter("txtmemoriaram");
            String armazenamento = request.getParameter("txtarmazenamento");
            String gabinete = request.getParameter("txtgabinete");
            String fonte = request.getParameter("txtfonte");
            String monitor = request.getParameter("txtmonitor");
            String teclado = request.getParameter("txtteclado");

            builder.comProcessador(processador);
            builder.comCooler(cooler);
            builder.comPlacadevideo(placadevideo);
            builder.comPlacamae(placamae);
            builder.comMemoriaram(memoriaram);
            builder.comArmazenamento(armazenamento);
            builder.comGabinete(gabinete);
            builder.comFonte(fonte);
            builder.comMonitor(monitor);
            builder.comTeclado(teclado);
            
            Produto produto = builder.constroi();
            pdao.cadastrar(produto);    
            msg = "Cadastrado com sucesso.";
            System.out.println("Cadastrado com sucesso.");

        } catch (ClassNotFoundException | SQLException | NumberFormatException ex) {
            msg = "Erro ao cadastrar.";
        }
        request.setAttribute("msg", msg);
        return "resultado.jsp";
    }

}
