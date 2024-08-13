package Model;

public class Company extends  TaxPayer{

    //variable de company
    private double cantidadTrabajadores;

    //const
    public Company (String name , double ingresoAnual , double cantidadTrabajadores){
        super(name,ingresoAnual);
        this.cantidadTrabajadores = cantidadTrabajadores;
    }


    @Override
    public double procesar() {
        //
        double total;

        if (cantidadTrabajadores <=10)
            total =  getAnulincome() * 0.16;
        else {
            total = getAnulincome() * 0.14;
        }
        return total;
    }
}
