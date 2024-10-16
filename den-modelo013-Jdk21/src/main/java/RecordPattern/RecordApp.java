package RecordPattern;

import model.ProductoRecord;

public class RecordApp {

    private void m1(Object param){

        //verifica la instancia de un objeto a un subObjeto o clase , o subclase
        if (param instanceof ProductoRecord pr){
            System.out.println(pr);
            System.out.println(pr.name());
            System.out.println(pr.status());
        }
    }

    private void m2(Object param){
        if(param instanceof ProductoRecord (int id,String name , double price, boolean status)){
            System.out.println(id);
            System.out.println(price);
        }
    }

    public static void main(String[] args) {
        RecordApp ap = new RecordApp();
        ap.m1(new ProductoRecord(1,"same",290,true));
        ap.m2(new ProductoRecord(1,"same",290,true));
    }
}
