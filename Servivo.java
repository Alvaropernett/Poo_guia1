abstract class Servivo {
    public abstract void respirar();
    }   
    interface Caminante{
        void Caminar();

    }

    class Humano extends Servivo implements Caminante {
        public void respirar() {
            System.out.println("El humano respiera.");
        }

    
        public void Caminar() {
            System.out.println("El humano camina.");
        }
    }

