package SuplierApp;

import java.time.LocalDate;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierDemo {

    //
    //supplier devuelve un objeto del tipo especifico


    //.get();
    // x =  parametro
    // -> operador
    // x=5 expresion que evalua

    // x -> x = 5;
    // () -> x = 5;

    private void m1(){
        Supplier<LocalDate> fx =  () -> LocalDate.now().minusDays(1);

        LocalDate date =  fx.get();
        System.out.println(date);
    }

    //
    public static Supplier<String> m2() {
        return () -> UUID.randomUUID().toString().replace("-", "").substring(0, 12); // Genera una contraseña de 12 caracteres
    }

    public static void main(String[] args) {
        SupplierDemo sp = new SupplierDemo();
        sp.m1();

        sp.m2();
        String pass = m2().get();
        System.out.println(pass);


    }


}
