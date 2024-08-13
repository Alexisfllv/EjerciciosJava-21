package App;

public class Principal {


    //clasica

//    public static void main(String[] args) {
//        System.out.println("clasico");
//    }

    //all

    public static void main (String ... as){
        System.out.println("all");

        //
        byte x1 = 127;
        short x2 =  32_767;
        int x3 = 327_677;
        float x4 =32_767.59f;
        double x5 =32_767.59d;

        char x = 'a';
        boolean y = true;

        String xyz = "mitocode";

        //Java Promotions
        byte a = 5;
        byte b = 7;
        int c =  a+b;

        int d =4;
        double e = 2.2;
        double f = d+e;
        System.out.println(f);

        //
        Integer numeroa = 2;
        int numerob = 23;
        int suma =  numeroa +numerob;
        System.out.println(suma);
    }
}
