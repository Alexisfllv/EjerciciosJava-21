package Model;

import Static.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Order {
    private LocalDate moment;
    //estado de orden
    private OrderStatus status;
    //datos cliente
    private Client client;
    //Cantidades de Productos
    private List<OrderItem> items;


    //variable suma
    private double hacerTotal(){
        double sum = 0;
        for (OrderItem fitem : items){
            //concatenar las sumas
            sum += fitem.getPreci() * fitem.getQuantity();
        }
        return  sum;
    }

    //metodo para agregar items
    public void addItem(OrderItem item){
        items.add(item);
    }

    //to String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Moment : ");
        sb.append(moment).append("\n");
        sb.append("Order Status : ");
        sb.append(status).append("\n");
        sb.append(client).append("\n");
        sb.append("Order Items : \n");

        //forEach
        for (OrderItem fitem : items){
            sb.append(fitem).append("\n");
        }

        sb.append("Total Precio : ");
        sb.append(hacerTotal());

        return sb.toString();
    }
}
