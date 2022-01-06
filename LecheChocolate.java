
package HerenciaJava;

    /**
     * @autor: jlianacastillo
     */

public class LecheChocolate extends EnvaseLacteos{
    // a continuacion añado los atributos de la primera clase hija
    protected String TipoSabor;
    protected String ContenidoNeto;    
    //constructor por defecto
    public LecheChocolate(){
    }
    public LecheChocolate(String TipoSabor, String ContenidoNeto){
        this.TipoSabor=TipoSabor;
        this.ContenidoNeto=ContenidoNeto;
    }
    //contructor de la herencia de los atributos de la clase padre EnvaseLacteos
    public LecheChocolate(String TipoBebida, int NumeroEnvase, int FechaVencimiento){
        super (TipoBebida, NumeroEnvase, FechaVencimiento);
    }
    public void setTipoSabor(String TipoSabor){
        this.TipoSabor=TipoSabor;
    }
    public String getTipoSabor(){
        return TipoSabor;
    }
    public void setContenidoNeto(String ContenidoNeto){
        this.ContenidoNeto=ContenidoNeto;
    }
    public String getContenidoNeto(){
        return ContenidoNeto;
    }
    public void imprimirLecheChocolate () {
        LecheChocolate objeto = new LecheChocolate ();
        objeto.setTipoSabor("Chocolate");
        objeto.setContenidoNeto("DOSCIENTOS MILILITROS");
        objeto.setTipoBebida("Leche");
        objeto.setNumeroEnvase(896533);
        objeto.setFechaVencimiento(14-12-2021);
       
        System.out.println("El sabor del envase es "+objeto.getTipoSabor()+"\n El contenido del envase es "+objeto.getContenidoNeto()+"\n El tipo de bebida del envase es "+objeto.getTipoBebida()+"\n El numero del envase es "+objeto.getNumeroEnvase()+"\n El envase se vence en "+objeto.getFechaVencimiento());
    }
}
