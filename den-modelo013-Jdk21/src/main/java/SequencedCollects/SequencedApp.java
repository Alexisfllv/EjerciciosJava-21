package SequencedCollects;

import model.Product;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SequencedMap;

public class SequencedApp {

    //
    public static void main(String[] args) {

        //
        List<Product> pr = new ArrayList<>();

        pr.add(new Product(1,"alexis",299.90,true));
        pr.add(new Product(2,"alexis",399.90,true));
        pr.add(new Product(3,"alexis",499.90,true));

        //jdk 8
        //agregar
        pr.add(0, new Product(4,"alexis",199.90,true));
        System.out.println(pr);
        pr.add(pr.size(), new Product(5,"alexis",599.90,true));

        //recuperar
        System.out.println(pr.get(0));
        System.out.println(pr.get(pr.size()-1));
        System.out.println(pr);

        //
        pr.addFirst(new Product(0,"ferr",90,false));
        pr.addLast(new Product(100,"ferr",20,true));
        System.out.println("first,last");
        pr.forEach(System.out::println);

        //SEQUENCEDMAP
        SequencedMap<Integer,Product> smap =  new LinkedHashMap<>();
        smap.put(1,new Product(1,"tv",100,true));
        smap.put(2,new Product(2,"tv",200,true));
        smap.put(3,new Product(3,"tv",300,true));

        //retirar
        smap.pollFirstEntry();
        smap.pollLastEntry();

        System.out.println(smap);

        //recupera
        System.out.println(smap.firstEntry());
        System.out.println(smap.lastEntry());

    }
}
