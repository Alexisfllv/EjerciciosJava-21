package App;

import Model.Company;
import Model.Individual;
import Model.TaxPayer;
import lombok.Cleanup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        @Cleanup
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresar un numero Contribuyentes : ");
        int cantidad = scan.nextInt();


        //arreglo para la clase padre
        List<TaxPayer> list = new ArrayList<>();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Informacion del Contribuyente : " + i);
            System.out.println("Es individual o company : (i/c) ? ");
            char tipo = scan.next().charAt(0);

            //valores padres

            System.out.println("Nombre : ");
            String name = scan.next();
            System.out.println("Ingreso Anual : ");
            double ingresoAnual = scan.nextDouble();




            //valor hijo
            if (tipo == 'i') {
                System.out.println("Ingreso salud : ");
                double salud = scan.nextDouble();

                //llenado
                Individual in = new Individual(name, ingresoAnual, salud);

                // agregar a la lista padre
                list.add(in);


            } else if (tipo == 'c') {
                System.out.println("Cantidad de Personas : ");
                int trabajadores = scan.nextInt();

                //llenado
                Company cm = new Company(name, ingresoAnual, trabajadores);

                //agregar a la lista padre
                list.add(cm);
            }

        }


        //resultado
        System.out.println("=======================");
        System.out.println("Resultado es : ");

        double sum = 0;

        for (TaxPayer tp : list){
            System.out.println(tp.getName() + " total es : " +tp.tax());
            sum =  sum + tp.tax();
        }
        System.out.println("Suma total es : " + sum);
        //


    }
}
