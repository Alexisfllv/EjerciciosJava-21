package Record;

import java.time.LocalDate;

public record ClientRecord (
        //Conceptos inmutables para clases finales

        int id,
        String name,
        LocalDate birthDate,
        boolean status
){

}
