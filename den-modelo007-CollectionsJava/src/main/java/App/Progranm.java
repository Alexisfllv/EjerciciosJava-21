package App;

import Model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Progranm {

    public static void main(String[] args) {
        //LISTAS
        //Collection

        List<Employee> listadoEmpleado =  new ArrayList<>();

        //objeto
        Employee em1 = new Employee(1,"pepe",1000);
        Employee em2 = new Employee(2,"mag",2000);

        //Agregar elementos
        listadoEmpleado.add(em1);
        listadoEmpleado.add(em2);

        //
        List<Employee> list2 = Arrays.asList(em1,em2);

        //capacidad inicial
        List<Employee> list3 = new ArrayList<>(100);


        List<Employee> list4 = new ArrayList<>();
        list4.add(new Employee(1,"mel",200));
        list4.add(new Employee(3,"kill",400));
        list4.add(new Employee(2,"mou",300));
        ;

        //ordenar los valores en reversa
        Collections.reverse(list4);
        //desordenar los valores
        Collections.shuffle(list4);

        System.out.println(list4);

        // Iteracion de listas

        // java <= 6
        for (int i = 0; i < list4.size(); i++) {
            System.out.println("listado : " + list4.get(i));
        }

        // java 7+
        for (Employee empl :  list4){
            System.out.println(empl);
        }

        // java 8+
        list4.forEach(valorxd -> System.out.println(valorxd.getName()));
        //
        list4.forEach(xd -> System.out.println(xd));







    }

}
