package Record;

import java.time.LocalDate;
import java.util.Objects;

public class Client {

    private final int id;
    private final String name;
    private final LocalDate birthDate;
    private final boolean status;

    public Client(int id, String name , LocalDate birthDate, boolean status){
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.status = status;
    }

    public LocalDate BirthDate() {
        return birthDate;
    }

    public int Id() {
        return id;
    }

    public String Name() {
        return name;
    }

    public boolean Status() {
        return status;
    }

    //


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && status == client.status && Objects.equals(name, client.name) && Objects.equals(birthDate, client.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDate, status);
    }
}
