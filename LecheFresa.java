
package HerenciaJava;

    /**
     * @autor: jlianacastillo
     */   

public class LecheFresa extends EnvaseLacteos{
    // a continuacion añado los atributos de la segundo clase hija
    protected String TipoColor;
    protected String TipoTapa;    
    //constructor por defecto
    public LecheFresa(){
    }
    public LecheFresa(String TipoColor, String TipoTapa){
        this.TipoColor=TipoColor;
        this.TipoTapa=TipoTapa;
    }
    //contructor de la herencia de los atributos de la clase padre EnvaseLacteos
    public LecheFresa(String TipoBebida, int NumeroEnvase, int FechaVencimiento){
        super (TipoBebida, NumeroEnvase, FechaVencimiento);
    }
    public void setTipoColor(String TipoColor){
        this.TipoColor=TipoColor;
    }
    public String getTipoColor(){
        return TipoColor;
    }
    public void setTipoTapa(String TipoTapa){
        this.TipoTapa=TipoTapa;
    }
    public String getTipoTapa(){
        return TipoTapa;
    }
    public void imprimirLecheFresa () {
        LecheFresa objeto = new LecheFresa ();
        objeto.setTipoColor("Rosado");
        objeto.setTipoTapa("Plastica");
        objeto.setTipoBebida("Leche");
        objeto.setNumeroEnvase(8118563);
        objeto.setFechaVencimiento(15-12-2021);
        System.out.println("La bebida LecheFresa es de color "+objeto.getTipoColor()+"\n Su tapa es "+objeto.getTipoTapa()+"\n Su bebida es de "+objeto.getTipoBebida()+"\n El numero de su envase es "+objeto.getNumeroEnvase()+"\n Su fecha de vencimiento es el "+objeto.getFechaVencimiento());
    }
}

