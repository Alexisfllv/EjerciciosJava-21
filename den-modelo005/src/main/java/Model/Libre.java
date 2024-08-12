package Model;

public class Libre extends TaxPayer{


    //variable
    private double control,componente,cambio;


    public Libre(String nombre , double sueldo , double control, double componente,double cambio){
        super(nombre,sueldo);
        this.control = control;
        this.componente = componente;
        this.cambio = cambio;
    }

    @Override
    public double procesar() {
        double valor = 0 ;
        if (control <=9){
            valor = Integer.parseInt(Double.toHexString(valor).substring(0,1));
        } else if (componente <= 99){
            valor = Integer.parseInt(Double.toHexString(valor).substring(1,2));
        } else if (cambio <= 999){
            valor = Integer.parseInt(Double.toHexString(valor).substring(2,3));
        }else {
            valor = 69;
        }
        return valor;
    }
}
