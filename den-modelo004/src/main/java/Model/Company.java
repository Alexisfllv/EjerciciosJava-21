package Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;




public class Company extends TaxPayer{

    //

    private int numbersOfEmployees;


    public Company(String name , Double anual, int numbersOfEmployees){
        super(name,anual);
        this.numbersOfEmployees = numbersOfEmployees;
    }

    @Override
    public double tax() {
        Double basic;

        if (this.numbersOfEmployees <=10){
            basic = getAnualincome() * 0.16;
        }else {
            basic = getAnualincome() * 0.14;
        }

        //
        return basic;
    }
}
