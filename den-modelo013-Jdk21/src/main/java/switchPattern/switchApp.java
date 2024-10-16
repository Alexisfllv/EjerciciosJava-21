package switchPattern;

import model.Product;
import model.ProductoRecord;

public class switchApp {
    //FINAL

    private String m1Pattern(Object param){
        return switch (param){
            case String a -> "case String";
            case Integer b when b <5 -> "case Integer";
            case Product p when p.getIdproduct() >0 -> "case Product y >0";
            case null -> "case null";
            case ProductoRecord r -> "case record";
            default -> "DEF CLASE";
        };
    }


    public static void main(String[] args) {
        switchApp sw =  new switchApp();
        String rp = sw.m1Pattern(new ProductoRecord(1,"WOW",90,true));
        System.out.println(rp);
    }

}
