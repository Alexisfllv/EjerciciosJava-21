package Threadd.Descarga;

public class MonitoreaProgreso extends Thread {
    public void run(){
        for (int i = 1; i <=100 ; i++) {
            System.out.println("Progreso: " + i + " % ");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
