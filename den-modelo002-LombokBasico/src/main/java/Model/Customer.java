package Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

//construir objetos de manera parcial
@Builder
public class Customer {


    private int idCustomer;
    private String name;
    private boolean isActive;
}
