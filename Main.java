
abstract class Animal {

    abstract void hacerSonido();
}


class Perro extends Animal {
    
    public void hacerSonido() {
        System.out.println("Guau!");
    }
}