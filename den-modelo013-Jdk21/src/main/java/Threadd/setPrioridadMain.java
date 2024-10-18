package Threadd;

public class setPrioridadMain {
    public static void main(String[] args) {
        setPrioridad  sp1 = new setPrioridad("Hilo 1");
        setPrioridad  sp2 = new setPrioridad("Hilo 2");

        //
        sp1.setPriority(Thread.MIN_PRIORITY);
        sp2.setPriority(Thread.MAX_PRIORITY);

        sp1.start();
        sp2.start();
    }
}
