package Ejericicios;


//solo puede tener un metodo a funcionar
@FunctionalInterface
public interface Operation {

    //metodo 1 y unico
    int operate (int x , int y);

    //metodo por defecto
    default int operate2(int x, int y ,int z){
        return x+y+z;
    }
}

