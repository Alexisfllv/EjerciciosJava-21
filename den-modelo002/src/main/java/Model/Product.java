package Model;


import lombok.*;

import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
//@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {





    //exluir o incluir un atributo al usar el equals
    @EqualsAndHashCode.Include
    @ToString.Include
    private String name;

    //excluir o incluir un atributo en el Constructor
    @ToString.Include
    private double price;


}
