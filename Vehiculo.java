
abstract class Vehiculo {
protected String marca;

public abstract void encender();

public void mostrarMarca(){
    System.out.println("Marca:" + marca);
    }
}       

class carro extends Vehiculo {
    public carro(String marca){
        this.marca = marca;
    
    }
    public void encender(){
        System.out.println("El caroo esta encendido.");
    }
}