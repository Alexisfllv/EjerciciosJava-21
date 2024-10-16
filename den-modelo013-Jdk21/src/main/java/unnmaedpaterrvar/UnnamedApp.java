package unnmaedpaterrvar;

import model.ProductoRecord;

public class UnnamedApp {

    // _ =  variable que no se usaran

    private void m1(Object param){
        if (param instanceof ProductoRecord(int id, String _, double price, boolean _)){
            System.out.println(id);
            System.out.println(price);
        }


        //VARIABLES SIN USAR = _
        try {

        }catch (Exception _){
            System.out.println("error");
        }

        //
        int x = m2Suma();

    }

    private Integer m2Suma(){
        return 5;
    }

    public static void main(String[] args) {
        UnnamedApp un = new UnnamedApp();
        un.m1(new ProductoRecord(1,"fase",23,true));
    }
}
