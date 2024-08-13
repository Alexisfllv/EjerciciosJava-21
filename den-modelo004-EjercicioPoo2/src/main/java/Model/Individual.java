package Model;

import lombok.*;



public class Individual extends  TaxPayer {


    private Double healthExpenditures;

    //constructor
    public Individual(String name, Double anualincome, Double healthExpenditures) {
        super(name, anualincome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {

        double basic;
        if (getAnualincome() < 20_000) {
            basic = getAnualincome() * 0.15;
        }else{
            basic = getAnualincome() * 0.25;
        }

        basic -= this.healthExpenditures * 0.5;


        if (basic < 0){
            basic = 0;
        }
        return basic;
    }


}
