package PredicateApp;

import java.util.function.Predicate;

public class PredicateDemo {

    //PREDICATE devuelve un Bolean

    // x =  parametro
    // -> operador
    // x=5 expresion que evalua

    // x -> x = 5;


    private void m1(){

        //declarar
        Predicate<Integer> checkAge = x -> x >=18;
        Predicate<String> checkChars = x -> x.length() >= 5;

        //efectuar
        boolean res =  checkAge.test(33);
        boolean res2 = checkChars.test("can");

        System.out.println(res);
        System.out.println(res2);
    }

    private void m2(){
        Predicate<Integer> great =  x -> x >20;
        Predicate<Integer> low =  x -> x <30;

        boolean res =  great.and(low).negate().test(25);
        System.out.println(res);
    }

    private void m3(Product product, Predicate<Product> fx){
        boolean res =  fx.test(product);
        System.out.println(res);
    }

    public static void main(String[] args) {
        //
        PredicateDemo pr =  new PredicateDemo();
        pr.m2();
        //
        Predicate<Product> f1 =  x -> x.getNombre().length() >=3 ;
        Predicate<Product> f2 = x  -> x.getId() >=1;

        //
        pr.m3(new Product(1,"Movi"),f1);

        pr.m3(new Product(1,"ma"),f2);
    }
}
