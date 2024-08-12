package Model;

public class Compan extends  TaxPayer{

    //VAR
    private double cantidadEmpleados;

    public Compan(String name , double sueldo , double cantidadEmpleados){
        super(name,sueldo);
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public double procesar() {
        double total;

        //
        if (cantidadEmpleados < 10){
            total = getAnulincome() * 0.14;
        }else {
            total =  getAnulincome() * 0.16;
        }

        return total;
    }

    //
}
