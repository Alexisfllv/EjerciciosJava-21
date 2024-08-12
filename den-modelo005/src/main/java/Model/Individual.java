package Model;

public class Individual extends TaxPayer{

    //variable de individual
    private double gastosSalud;



    //superconstructor
    public Individual(String name , double anualincome,double gastosSalud){
        super(name,anualincome);
        this.gastosSalud = gastosSalud;
    }


    //metodo
    @Override
    public double procesar() {
        double total;
        if (getAnulincome() < 20_000){
            total = getAnulincome() * 0.15;
        }else {
            total = getAnulincome() * 0.25;
        }

        double salud = 0;
        if (this.gastosSalud >0){
            salud =  this.gastosSalud *0.50;
        }
        total -=salud;
        //
        return  total;
    }
}
