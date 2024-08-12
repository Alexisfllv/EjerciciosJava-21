package Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class TaxPayer {

    //
    private String name;
    private double anulincome;

    //

    public abstract double procesar();
}
