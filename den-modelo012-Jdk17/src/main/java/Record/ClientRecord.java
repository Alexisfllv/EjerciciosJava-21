package Record;

import java.time.LocalDate;

public record ClientRecord (
        //Conceptos inmutables para clases finales

        int id,
        String name,
        LocalDate birthDate,
        boolean status
){

    //valores por defecto
    public ClientRecord (int id){
        this(id,"defecto nombre v1",LocalDate.now(),true);

    }

    public ClientRecord (LocalDate birthDate){
        this(1,"nombre def v2",birthDate,true);
    }
}
