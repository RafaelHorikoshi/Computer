package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Produto;
import model.ProdutoBuilder;
import util.FabricaConexao;

public class ProdutoDAO {
    
    public static Connection getConexao() throws ClassNotFoundException, SQLException{
        return FabricaConexao.getConexaoMySQL();
    }
    
    public void cadastrar(Produto prod) throws ClassNotFoundException, SQLException {
        Connection con = getConexao();
        PreparedStatement comando = con.prepareStatement("insert into produtos (processador, cooler, placadevideo, placamae, memoriaram, armazenamento, gabinete, fonte, monitor, teclado) values (?,?,?,?,?,?,?,?,?,?)");
        comando.setString(1, prod.getProcessador());
        comando.setString(2, prod.getCooler());
        comando.setString(3, prod.getPlacadevideo());
        comando.setString(4, prod.getPlacamae());
        comando.setString(5, prod.getMemoriaram());
        comando.setString(6, prod.getArmazenamento());
        comando.setString(7, prod.getGabinete());
        comando.setString(8, prod.getFonte());
        comando.setString(9, prod.getMonitor());
        comando.setString(10, prod.getTeclado());           
        comando.execute();
        con.close();
    }
    
    public void deletar(Produto prod) throws ClassNotFoundException, SQLException {
        Connection con = getConexao();
        PreparedStatement comando = con.prepareStatement("delete from produtos where id = ?");
        comando.setInt(1, prod.getId());
        comando.execute();
        con.close();
    }
    
    public void atualizar(Produto prod) throws ClassNotFoundException, SQLException {
        Connection con = getConexao();
        PreparedStatement comando = con.prepareStatement("update produtos set processador = ?, cooler = ?, placadevideo = ?, placamae = ?, memoriaram = ?, armazenamento = ?, gabinete = ?, fonte = ?, monitor = ?, teclado = ? where id = ?");
        comando.setString(1, prod.getProcessador());
        comando.setString(2, prod.getCooler());
        comando.setString(3, prod.getPlacadevideo());
        comando.setString(4, prod.getPlacamae());
        comando.setString(5, prod.getMemoriaram());
        comando.setString(6, prod.getArmazenamento());
        comando.setString(7, prod.getGabinete());
        comando.setString(8, prod.getFonte());
        comando.setString(9, prod.getMonitor());
        comando.setString(10, prod.getTeclado());   
        comando.setInt(11, prod.getId());
        comando.execute();
        con.close();
    }    
    
    public Produto consultarById(Produto prod) throws ClassNotFoundException, SQLException {
        Connection con = getConexao();
        PreparedStatement comando = con.prepareStatement("select * from produtos where id = ?");
        comando.setInt(1, prod.getId());
        ResultSet rs = comando.executeQuery();
        ProdutoBuilder builder = new ProdutoBuilder();
        Produto produto = null;
        if (rs.next()) {
            builder.comId(rs.getInt("id"));
            builder.comProcessador(rs.getString("processador"));
            builder.comCooler(rs.getString("cooler"));
            builder.comPlacadevideo(rs.getString("placadevideo"));
            builder.comPlacamae(rs.getString("placamae")); 
            builder.comMemoriaram(rs.getString("memoriaram"));
            builder.comArmazenamento(rs.getString("armazenamento")); 
            builder.comGabinete(rs.getString("gabinete"));
            builder.comFonte(rs.getString("fonte")); 
            builder.comMonitor(rs.getString("monitor"));
            builder.comTeclado(rs.getString("teclado")); 
            produto = builder.constroi();
        }       
        con.close();
        return produto;
    }
    
    public List<Produto> consultarTodos() throws ClassNotFoundException, SQLException {
        Connection con = getConexao();
        PreparedStatement comando = con.prepareStatement("select * from produtos");        
        ResultSet rs = comando.executeQuery();        
        List<Produto> lprod = new ArrayList<Produto>();
        int cont = 0;
        while(rs.next()){
            ProdutoBuilder builder = new ProdutoBuilder();
            builder.comId(rs.getInt("id"));
            builder.comProcessador(rs.getString("processador"));
            builder.comCooler(rs.getString("cooler"));
            builder.comPlacadevideo(rs.getString("placadevideo"));
            builder.comPlacamae(rs.getString("placamae")); 
            builder.comMemoriaram(rs.getString("memoriaram"));
            builder.comArmazenamento(rs.getString("armazenamento")); 
            builder.comGabinete(rs.getString("gabinete"));
            builder.comFonte(rs.getString("fonte")); 
            builder.comMonitor(rs.getString("monitor"));
            builder.comTeclado(rs.getString("teclado")); 
            Produto produto = builder.constroi();
            lprod.add(produto);
            cont++;
        }
        System.out.println("Cont..: " + cont);
        con.close();
        return lprod;
    }    
}
