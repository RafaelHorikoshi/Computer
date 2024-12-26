package model;

public class ProdutoBuilder {
    
    private int id;
    private String processador;
    private String cooler;
    private String placadevideo;
    private String placamae;
    private String memoriaram;
    private String armazenamento;
    private String gabinete;
    private String fonte;
    private String monitor;
    private String teclado;
    
    public ProdutoBuilder comId(int id){
        this.id = id;
        return this;
    }
    
    public ProdutoBuilder comProcessador(String processador){
        this.processador = processador;
        return this;
    }
        
    public ProdutoBuilder comCooler(String cooler){
        this.cooler = cooler;
        return this;
    }
    
    public ProdutoBuilder comPlacadevideo(String placadevideo){
        this.placadevideo = placadevideo;
        return this;
    }
    
    public ProdutoBuilder comPlacamae(String placamae){
        this.placamae = placamae;
        return this;
    }
    
    public ProdutoBuilder comMemoriaram(String memoriaram){
        this.memoriaram = memoriaram;
        return this;
    }
    
    public ProdutoBuilder comArmazenamento(String armazenamento){
        this.armazenamento = armazenamento;
        return this;
    }
    
    public ProdutoBuilder comGabinete(String gabinete){
        this.gabinete = gabinete;
        return this;
    }
    
    public ProdutoBuilder comFonte(String fonte){
        this.fonte = fonte;
        return this;
    }
    
    public ProdutoBuilder comMonitor(String monitor){
        this.monitor = monitor;
        return this;
    }
    
     public ProdutoBuilder comTeclado(String teclado){
        this.teclado = teclado;
        return this;
    }   
    
    public Produto constroi(){
        return new Produto(id, processador, cooler, placadevideo, placamae, memoriaram, armazenamento, gabinete, fonte, monitor, teclado);
    }  
}
