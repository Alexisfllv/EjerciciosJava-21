package Threadd.Descarga;

public class Main {
    public static void main(String[] args) {
        DecargaArchivo da =  new DecargaArchivo();
        MonitoreaProgreso mt = new MonitoreaProgreso();

        da.start();
        mt.start();
    }
}
