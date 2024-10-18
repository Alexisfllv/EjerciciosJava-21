package ThreadsVirtuales;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class VthreadApp {

    //
    private void m1Basic() throws InterruptedException {
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(" index "+ i);
            }
        };
                                //procesadores logicos
        Thread vthread = Thread.ofPlatform().start(r);
        vthread.join();
    }

    private void m2TestPerformance(boolean VThreads){
        System.out.println("vThreads  : " + VThreads);
        Instant start = Instant.now();

        Random rn = new Random();
        Runnable rnb = () ->{
            double i = rn.nextDouble(1000) % rn.nextDouble(1000);
        };
        for (int i = 0; i <50000 ; i++) {
            if (VThreads){
                Thread.startVirtualThread(rnb);
            }else {
                Thread t = new Thread(rnb);
                t.start();
            }
        }

        Instant end = Instant.now();

        long time = Duration.between(start,end).toMillis();
        System.out.println("Time : " + time);
    }


    public static void main(String[] args) throws InterruptedException {
            VthreadApp ap = new VthreadApp();
            ap.m2TestPerformance(true);
    }
}
