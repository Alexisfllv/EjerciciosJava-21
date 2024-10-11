package Record;

import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        //
        Client c =  new Client(1,"alexis", LocalDate.now(),true);
        ClientRecord cr =  new ClientRecord(1,"fawcett", LocalDate.now(),true);

        System.out.println(cr);

        //Cliente Record por defecto v1
        ClientRecord crv1 =  new ClientRecord(1);

        System.out.println(crv1);

        //v2
        ClientRecord crv2 =  new ClientRecord(LocalDate.of(2020,12,12));
        System.out.println(crv2);
    }
}
