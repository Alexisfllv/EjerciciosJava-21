package ConsumerApp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    //
    //Consumer devuelve un void
    //.acept();

    // x =  parametro
    // -> operador
    // x=5 expresion que evalua

    // x -> x = 5;

    private void m1(){
        //def
        Consumer<String> fx1 = x -> System.out.println(x);

        //fun
        fx1.accept("Hello");

    }

    private void m2(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.forEach(integer -> System.out.println(integer));
    }

    private void listado(int x){
        System.out.println(x);
    }

    //

    public static void main(String[] args) {
        ConsumerDemo cs = new ConsumerDemo();
        cs.m2();
    }

}
