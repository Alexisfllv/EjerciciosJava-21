package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class OrderItem {

    //Datos de cantidad de producto
    private int quantity;
    private double preci;
    //Datos del producto
    private Product product;

}
