package Threadd.Descarga;

public class DecargaArchivo  extends  Thread{
    public void run(){
        //
        for (int i = 1; i <= 100; i++) {
            System.out.println("Descargando... " + i + " %");
            try{
                Thread.sleep(100);
            }catch (InterruptedException _){
                System.out.println("rr");
            }
        }
        System.out.println("DESCARGA COMPLETA");
    }
}
