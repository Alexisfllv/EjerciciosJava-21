package App;

import Model.Car;
import Model.Subaru;
import Model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Programn {

    //
    //T = type | tipo de clase
    //K = key | llave
    //V = Value | valor
    //E = Element
    //? = wildcard | extends Object


    //uupper-bounded
    //algo tiene que ser menor igual que 'car'
    public  <S> S m1(List<? extends Car> list){
        return null;
    }

    //lower-bounded
    public void m2 (List<? super Car> list){

    }

    //
    public static void main(String[] args) {

        Programn p = new Programn();
        List<Subaru> list1 = new ArrayList<>();

        p.m1(list1);

        //
        List<Car> list2 = new ArrayList<>();
        p.m2(list2);
    }
    //GENERICOS ESTAN EN CLASES , METODOS , ATRIBUTOS DE METODOS

}
