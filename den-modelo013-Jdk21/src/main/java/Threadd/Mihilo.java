package Threadd;

public class Mihilo  implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try{
                Thread.sleep(500);
                System.out.println("Hilo ejecutandose : " + i);

            } catch (InterruptedException _){
                System.out.println("Hilo muerto");
            }
        }
    }

    //metodo de ejecucion
//    public void run(){
//        System.out.println("Este codigo se ejectua en un hilo");
//    }


}
