package StringTemplate;

public class StringTemplateApp {

    public static void main(String[] args) {

        String user = "mitocode";

        String supermessage = STR."""
                Hola usuario \{user}
                """;

        System.out.println(supermessage);
    }

}
