package App;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Integer> listadoNumeros = new ArrayList<>();
        listadoNumeros.add(1);
        listadoNumeros.add(2);
        listadoNumeros.add(3);
        listadoNumeros.add(4);
        listadoNumeros.add(5);

        //de forma parametro y funcion
        // e -> {funcion}
        listadoNumeros.forEach(e -> {
            e++;
            System.out.println(e);
        });
    }
}
