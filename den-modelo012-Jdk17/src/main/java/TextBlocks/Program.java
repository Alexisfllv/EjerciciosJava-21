package TextBlocks;

public class Program {


    private void m1Simple() {
        String text = """
                Este es un bloque de texto
                 y no requiere
                un operador + 
                """;
        System.out.println(text);
    }

    private void m2Identation() {
        String json = """
                {
                    "name": "John",
                    "age": 30,
                    "city": "New York",
                    "languages": ["English", "Spanish", "French"]
                }
                """;
        System.out.println(json);

        String html = """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>My Web Page</title>
                </head>
                <body>
                    <h1>Welcome to My Web Page</h1>
                    <p>This is a simple example of an HTML page.</p>
                </body>
                </html>
                """;
        System.out.println(html);

        String sqlQuery = """
                SELECT id, name, email
                FROM users
                WHERE status = 'active'
                ORDER BY name;
                """;
        System.out.println(sqlQuery);

        String message = """
                    Welcome to the "Java World"!
                    Here's a list of items:
                        - Item 1
                        - Item 2
                        - Item 3
                    Thank you for your attention.
                """;
        System.out.println(message);
    }

    private void m3scapeDoubleQuotes() {
        String text = """
                    hola bievenido "a este cambio"
                                        
                                        
                    """;
        System.out.println(text);
    }

    public static void main(String[] args) {
        Program p = new Program();
        p.m1Simple();

        p.m2Identation();
        p.m3scapeDoubleQuotes();
    }
}
