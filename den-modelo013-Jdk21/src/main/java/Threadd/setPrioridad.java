package Threadd;

public class setPrioridad extends  Thread {

    //
    public setPrioridad(String nombre){
        super(nombre);
    }

    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println(i + " : ejecucion");
        }
    }

}
