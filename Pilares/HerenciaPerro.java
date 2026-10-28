class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre); // Llama al constructor de la clase padre (Animal)
    }

    // Implementación obligatoria por el contrato de Abstracción
    @Override
    public void emitirSonido() {
        System.out.println(nombre + " dice: ¡Guau Guau!");
    }
}