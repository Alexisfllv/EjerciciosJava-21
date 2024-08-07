package App;

import Model.Client;
import Model.Order;
import Model.OrderItem;
import Model.Product;
import Static.OrderStatus;
import lombok.Cleanup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    //
    public static void main(String[] args) {


        //
        @Cleanup
        Scanner scan  = new Scanner(System.in);

        System.out.println("Ingrese datos del cliente : ");
        System.out.println("Name : ");
        String name = scan.nextLine();
        System.out.println("Email : ");
        String email = scan.nextLine();
        System.out.println("Birth date : (YYYY-MM-DD) : ");
        String birthDate =  scan.nextLine();
        LocalDate birthDateLocal = LocalDate.parse(birthDate);

        //Cliente
        Client client =  new Client(name,email,birthDateLocal);

        //Estado de compra
        System.out.println(" Order Data ");
        System.out.println("Ingrese el estado de compra : ");
        OrderStatus status =  OrderStatus.valueOf(scan.nextLine());

        //llenamos datos
        Order order =  new Order(LocalDate.now(),status,client,new ArrayList<>());

        //Estado de Orden
        System.out.println("Cuantos productos va a ingresar : ");
        int cantidad =  scan.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            //Productos
            System.out.println("Producto numero #" + i);
            System.out.println("Ingrese nombre del Producto : ");
            String nombreProducto =  scan.next();
            System.out.println("Precio del Producto : ");
            Double precioProducto =  scan.nextDouble();
            System.out.println("Cantidad del Producto : ");
            int cantidadProducto =  scan.nextInt();

            //Producto
            Product product = new Product(nombreProducto,precioProducto);
            //Orden de Items
            OrderItem orderItem =  new OrderItem(cantidadProducto,precioProducto,product);

            order.addItem(orderItem);
        }

        //resumen de la compra
        System.out.println("ORDER");
        System.out.println(order);


    }
}
