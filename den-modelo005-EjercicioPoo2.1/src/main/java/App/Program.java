package App;

import Model.Company;
import Model.Individual;
import Model.Libre;
import Model.TaxPayer;
import lombok.Cleanup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class Program {

    //
    public static void main(String[] args) {


        @Cleanup
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese cantidad de trabajadores : " );
        int cantidadTrabajadores =  scan.nextInt();

        //arreglo de listas
        List<TaxPayer> listas =  new ArrayList<>();

        for (int i = 1; i <= cantidadTrabajadores; i++) {

            System.out.println("Numero de persona " + i);
            System.out.println("Persona es i o c : ");
            char tipo =  scan.next().charAt(0);

            //datos predeterminados
            System.out.println("Ingresar nombres : ");
            String nombre = scan.next();

            System.out.println("Ingresar sueldo anual : ");
            double sueldo =  scan.nextDouble();

            // datos segun tipo

            if (tipo == 'i'){
                System.out.println("ingrese gasto de salud : ");
                double salud =  scan.nextDouble();
                //
                Individual in = new Individual(nombre,sueldo,salud);
                listas.add(in);
            } else if (tipo == 'c') {
                System.out.println("Ingrese cantidad de personas : ");
                int personas = scan.nextInt();
                //
                Company cm = new Company(nombre,sueldo,personas);
                listas.add(cm);
            } else if (tipo == 'f') {
                System.out.println("Ingresar numero de Control :");
                double control =  scan.nextDouble();
                System.out.println("Ingresar numero de Componente :");
                double componente =  scan.nextDouble();
                System.out.println("Ingresar numero de Cambio :");
                double cambio =  scan.nextDouble();
                //funcion
                Libre lb = new Libre(nombre,sueldo,control,componente,cambio);
                listas.add(lb);
            }

        }

        //mostrar la lista y su valor total
        System.out.println("===================");
        System.out.println("Listado : ");
        //valor total
        double total = 0;
        for (TaxPayer ls : listas){
            System.out.println("Persona : " + ls.getName());
            System.out.println("Sueldo Total es : " + ls.procesar());
            total += ls.procesar();
        }


        System.out.println("suma total es : "+ total );

    }
}
