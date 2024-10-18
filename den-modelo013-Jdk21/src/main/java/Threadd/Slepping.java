package Threadd;

public class Slepping {

//    @Override
//    public void run() {
//        for (int i = 1; i < 5; i++) {
//            try{
//                Thread.sleep(500);
//                System.out.println("Hilo ejecutandose : " + i);
//
//            } catch (InterruptedException _){
//                System.out.println("Hilo muerto");
//            }
//        }
//    }

    //
    public static void main(String[] args) {
        Mihilo mh = new Mihilo();
        mh.run();
        System.out.println("hilo principal");
    }
}
