package App;


import Model.Compan;
import Model.Individual;
import Model.TaxPayer;
import lombok.Cleanup;

import java.util.ArrayList;
import java.util.Scanner;

public class Program  {



    public static void main(String[] args) {


        @Cleanup
        Scanner can = new Scanner(System.in);

        System.out.println("Cuantas personas seran : ");
        int cantidad = can.nextInt();

        ArrayList<TaxPayer> listado =  new ArrayList();

        for (int i = 1; i <= cantidad ; i++) {

            //atributos comunes
            System.out.println("Persona que tipo es i/c: ");
            char tipo = can.next().charAt(0);

            //att
            System.out.println("Ingreso de nombre : ");
            String name = can.next();

            System.out.println("Ingresar cantidad de ingreso : ");
            double anual = can.nextDouble();

            //efocados
            if (tipo == 'i'){
                System.out.println("Ingresa la cantidad de gasto salud :  ");
                double salud = can.nextDouble();
                //add lista
                Individual in = new Individual(name,anual,salud);
                listado.add(in);
            }else {
                System.out.println("Ingresa la cantidad personas  ");
                int persnas = can.nextInt();
                //add lista
                Compan cn = new Compan(name,anual,persnas);
                listado.add(cn);
            }
        }

        //Final
        System.out.println("==========");
        double total = 0;
        for (TaxPayer taxlistado : listado){
            System.out.println("nombre es : " + taxlistado.getName());
            System.out.println("valor impuesto es : " + taxlistado.procesar());
            total += taxlistado.procesar();
        }

        System.out.println("TOLTA ES : " + total);

    }

}
