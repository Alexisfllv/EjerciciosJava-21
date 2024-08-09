package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class TaxPayer {

    //
    private String name;
    private Double anualincome;

    //metodo de evaluar
    public abstract double tax();

}
