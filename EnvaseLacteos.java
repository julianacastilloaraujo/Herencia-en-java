
package HerenciaJava;

    /**
     * @autor: jlianacastillo
     */
public class EnvaseLacteos {
    //a continuacion añado los atributos de la clase padre llamada Envase
    
    public String TipoBebida;
    public int NumeroEnvase;
    public int FechaVencimiento;
    
    //constructor por defecto
    
    public EnvaseLacteos (){       
    }
    public EnvaseLacteos(String TipoBebida, int NumeroEnvase, int FechaVencimiento){
        super();
        this.TipoBebida=TipoBebida;
        this.NumeroEnvase=NumeroEnvase;
        this.FechaVencimiento=FechaVencimiento;
    }
    public void setTipoBebida(String TipoBebida){
        this.TipoBebida=TipoBebida;
    }
    public String getTipoBebida(){
        return TipoBebida;
    }
    public void setNumeroEnvase(int NumeroEnvase){
        this.NumeroEnvase=NumeroEnvase;
    }
    public int getNumeroEnvase(){
        return NumeroEnvase;
    }
    public void setFechaVencimiento(int FechaVencimiento){
        this.FechaVencimiento=FechaVencimiento;
    }
    public int getFechaVencimiento(){
        return FechaVencimiento;
    }
    }
    

