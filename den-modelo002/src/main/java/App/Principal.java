package App;

import Model.Product;

public class Principal {

    public static void main(String[] args) {

        Product p = new Product();
        p.setName("ferrari");
        p.setPrice(21_122.20);
        System.out.println(p.getName() +  " " +  p.getPrice());

        //
        Product p1 =  new Product("lambo",2323_23);
        System.out.println(p1.getName() +  " " +  p1.getPrice());


        Product p2 =  new Product("lambo",2323_23.2);
        System.out.println(p2.getName() +  " " +  p2.getPrice());

        System.out.println(p2.toString());
        System.out.println(p1.equals(p2));

        //variables
        int x = 5;
        int y = 5;
        System.out.println(x == y);

        //
        System.out.println("nivel 2");
        System.out.println(p);
    }
}
