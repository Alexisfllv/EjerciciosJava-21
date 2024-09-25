package Optional;

import java.util.Optional;


public class Programn {

    public static void main(String[] args) {

        //un nullpoiterExcepcion ocurre cuando intentas inicializar un objeto que no ha sido inicializado null


        //
        Optional<Employee> op = Optional.of(new Employee(1,"mito","Programer",1233.2,"ti"));

        Optional<Employee> op2 =  Optional.empty();

        //verificar si hay datos dentro del objeto
        System.out.println(op.isPresent());

        //verificar si esta vacio
        System.out.println(op.isEmpty());

        //ver la informacion que lleva
        System.out.println(op.get());

        //Consumer no devuelve nada solo algo del mismo valor o tipo
        op.ifPresent(obj -> System.out.println(obj.getNameEmployee()));

        //Metodo para devolver un valor por defecto en caso que venga vacio
        System.out.println(op2.orElse(new Employee()));

        //Devuelve un valor por defeceto pero se puede detallar {}
        System.out.println(op2.orElseGet(() -> new Employee()));

        // caso de error
        //ofNullable Ignorael NPE y duevlve el valor por defecto
        Optional<Employee> op3 = Optional.ofNullable(null);

        //Ocasiona un NPE
        //Optional<Employee> op4 = Optional.of(null);

        System.out.println(op3.orElseGet(Employee::new));

        //cuando venga vacio el objeto se lanza la excepcion indicada
        System.out.println(op3.orElseThrow(() -> new RuntimeException()));


    }
}
