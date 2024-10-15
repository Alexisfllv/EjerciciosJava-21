package SwitchPatterns;

public class Program {

    //
    private void m1Basic(String param){
        switch (param.toUpperCase()){
            case "A":
                System.out.println("caso a");
                break;
            case "B":
                System.out.println("caso b");
                break;
            default:
                System.out.println("none");
        }
    }

    //
    private void m2Arrow(String param){
        switch (param){
            case "A" -> System.out.println("Case A");
            case "B" -> System.out.println("Case B");
            default -> System.out.println("Default Case");

        }
    }

    //switch de expression
    private String m3Yield(String param){
        return switch (param){
            case "A":
                yield "case AA";
            default:
                yield "DEFAULT";

        };
    }

    private String m4ArrowReturn(String param){
        return switch (param){
            case "A" -> "caso Aa";
            case "b" -> {
                //codigo en retorno a un yield

                yield "case b";
            }
            default -> "defaulters";
        };
    }

    private void m5MultipleCase(String param){
        switch (param){
            case "A" , "B" -> System.out.println("casos a y b marcados");
            case "C" , "D" -> System.out.println("caso c marcado");
            default -> System.out.println("def");
        }
    }



    public static void main(String[] args) {

        //
        Program p = new Program();
        p.m1Basic("a");
        p.m2Arrow("A");
        System.out.println(p.m3Yield("A"));
        System.out.println(p.m4ArrowReturn("a"));
        p.m5MultipleCase("A");
    }
}

