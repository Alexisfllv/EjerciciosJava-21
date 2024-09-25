package FunctionApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {

    //FUNCTION devuelve el segundo paramatro <1,2>

    //.apply();
    // x =  parametro
    // -> operador
    // x=5 expresion que evalua

    // x -> x = 5;

    //ANDTHEN , 1 ,2 ,3 .(X);
    //COMPOSE ,3,2,1.(X);

    private void m1(){
        Function<String, Boolean> fx =  x -> x.length() >4;

        boolean res = fx.apply("mitomito");
        System.out.println(res);
    }

    private void m2(){
        Function<String , Integer> func1 = x -> x.length();
        Function<Integer, Integer> func2 = x -> x +10;

        int caracteres =  func1.apply("Alexis");

        int res = func1.andThen(func2).apply("Alexis");

        System.out.println(caracteres);
        System.out.println(res);
    }

    private void m2v2(){
        Function<Integer,Integer> fx1 = x -> x *2;
        Function<Integer,Integer> fx2 = x -> x + 10;

        Function<Integer,Integer> fx3 = x -> x * 2;

        //fx1 = x = 5*2;  //10
        //fx2 = x = 10 +10;  //20

        int res = fx1.andThen(fx2).apply(5);

        int resd = fx1.apply(5);

        //fx3 =  x = 20 *2; //15
        int resh =  fx1.andThen(fx2).compose(fx3).apply(5);

        //fx1 =  x = 5 * 2; //10
        //fx3 = x = 10 * 2; //20
        //fx2 = x = 20 + 10; //30

        System.out.println(resd);
        System.out.println(res);
        System.out.println(resh);
    }

    //
    private void m2v3(){
        Function<String,Boolean> f1 = x -> x.length() > 1; //true

        Function<Boolean,Integer> f2 = x -> x==true ? 100:000;

        boolean nombre = f1.apply("");
        int valor = f1.andThen(f2).apply("Alexis");

        System.out.println(nombre);
        System.out.println(valor);
    }

    //static identity
    //funcion espejo


    private void m3(){
        //f(x) =x

        List<Employee> listadoEmpleados =  new ArrayList<>();
        listadoEmpleados.add(new Employee(1, "CarlosPerez", "Developer", 3500.00, "IT"));
        listadoEmpleados.add(new Employee(2, "AnaGarcía", "HR Manager", 4200.00, "Human Resources"));
        listadoEmpleados.add(new Employee(3, "LuisFernández", "Marketing Specialist", 2800.00, "Marketing"));
        listadoEmpleados.add(new Employee(4, "MaríaLópez", "Sales Representative", 3100.00, "Sales"));
        listadoEmpleados.add(new Employee(5, "JorgeRamos", "Accountant", 3900.00, "Finance"));

        //
        System.out.println(listadoEmpleados);

        Map<Integer,Employee> mapeodeEmpleados = listadoEmpleados.stream().collect(Collectors.toMap(e -> e.getIdEmployee(), e -> e));;
        
        Map<Integer,Employee> mapeodeEmpleados2 = listadoEmpleados.stream().collect(Collectors.toMap(Employee::getIdEmployee, Function.identity()));;
        System.out.println(mapeodeEmpleados);
        //


        Map<Integer,String> mapaPrueba = new HashMap<>();

        for (Employee map: listadoEmpleados){
            mapaPrueba.put(map.getIdEmployee(),map.getNameEmployee());
        }
        System.out.println(mapaPrueba);

    }

    public static void main(String[] args) {
        FunctionDemo dm =  new FunctionDemo();
        dm.m3();
    }
}
