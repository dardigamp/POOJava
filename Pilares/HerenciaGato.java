// Otra subclase que hereda de Animal
class Gato extends Animal {
    
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}