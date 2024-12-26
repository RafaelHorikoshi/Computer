package model;

public class Produto {

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

    public Produto(){
        
    }
     
    public Produto(int id, String processador, String cooler, String placadevideo, String placamae, String memoriaram, String armazenamento, String gabinete, String fonte, String monitor, String teclado) {
        this.id = id;
        this.processador = processador;
        this.cooler = cooler;
        this.placadevideo = placadevideo;
        this.placamae = placamae;
        this.memoriaram = memoriaram;
        this.armazenamento = armazenamento;
        this.gabinete = gabinete;
        this.fonte = fonte;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getCooler() {
        return cooler;
    }

    public void setCooler(String cooler) {
        this.cooler = cooler;
    }

    public String getPlacadevideo() {
        return placadevideo;
    }

    public void setPlacadevideo(String placadevideo) {
        this.placadevideo = placadevideo;
    }

    public String getPlacamae() {
        return placamae;
    }

    public void setPlacamae(String placamae) {
        this.placamae = placamae;
    }

    public String getMemoriaram() {
        return memoriaram;
    }

    public void setMemoriaram(String memoriaram) {
        this.memoriaram = memoriaram;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }
    
    

    
    
    
}
