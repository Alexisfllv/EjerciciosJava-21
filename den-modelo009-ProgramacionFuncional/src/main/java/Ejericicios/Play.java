package Ejericicios;

public class Play extends Sum{

    //
    public static void main(String[] args) {
        int valora = 10;
        int valorb = 20;

        Sum sum =  new Sum();

        int  res = sum.operate(valora,valorb);
        System.out.println(res);

        //Operacion lambda para metodos abstractos
        Operation op1 = (a,b) -> a*b; //multiplicacion
        Operation op2 = (a,b) -> a+b; //suma

        //efectuar
        int res1 = op1.operate(2,3); //llama al metodo abstracto
        int res2 = op2.operate(5,6); //llama al metodo abstracto

        System.out.println(res1); //6
        System.out.println(res2); //11

        // metodo default
        int res1def = op1.operate2(2,3,4); //metodo default

        System.out.println(res1def);

        //
    }
}
