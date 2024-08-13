package Model;

public class Individual extends  TaxPayer{

    //VAR
    private double precioSalud;

    public Individual(String name , double sueldo , double precioSalud){
        super(name,sueldo);
        this.precioSalud = precioSalud;
    }


    @Override
    public double procesar() {
        double total;

        if (getAnulincome() <=20000){
            total =  getAnulincome() * 0.15;
        }else {
            total = getAnulincome() * 0.25;
        }

        total -= precioSalud * 0.5;

        return total;
    }
}
