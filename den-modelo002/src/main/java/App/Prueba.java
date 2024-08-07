package App;

import Model.Customer;
import Model.Product;

public class Prueba {
    public static void main(String[] args) {

        Customer c1 =  new Customer(1,"Alexis",true);

        //builder
        //
        Customer.CustomerBuilder c2 =  Customer.builder();
        c2.idCustomer(1);
        c2.name("Ferr");
        System.out.println(c2);
        c2.isActive(true);
        System.out.println(c2.build());

        //
        Product.ProductBuilder p1 = Product.builder();
        
        System.out.println(p1.build());

    }
}
