abstract class Instrumento {
    public abstract void Tocar();
}
 interface afinar {
    void afinar ();
 }

 class Guitarra extends Instrumento implements afinar {

    @Override
    public void afinar() {
    
        System.out.println("Afinando la Guitarra");
    }

    @Override
    public void Tocar() {
       
        System.out.println("Tocando la Guitarra");
    }
    
 }