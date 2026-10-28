public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- 1. Probando Encapsulamiento ---");
        CuentaBancaria cuenta = new CuentaBancaria(100.0);
        cuenta.depositar(50.0);       // Funciona y valida internamente
        cuenta.depositar(-20.0);      // Bloqueado por la validación
        // cuenta.saldo = 50000;       // ERROR DE COMPILACIÓN: saldo es privado
        System.out.println("Saldo final: $" + cuenta.getSaldo());


        System.out.println("\n--- 2. Probando Polimorfismo ---");
        // POLIMORFISMO: Declaramos variables del tipo padre (Animal)
        // pero las instanciamos con tipos hijos distintos (Perro y Gato).
        Animal miPerro = new Perro("Firulais");
        Animal miGato = new Gato("Michi");

        // El mismo método 'emitirSonido()' actúa de forma totalmente diferente
        // dependiendo de la instancia real que viva en memoria.
        hacerSonarAnimal(miPerro); // Salida: Firulais dice: ¡Guau Guau!
        hacerSonarAnimal(miGato);  // Salida: Michi dice: ¡Miau!
    }

    // Método polimórfico por excelencia: Recibe la abstracción (Animal) 
    // y acepta de manera dinámica cualquier subclase que se derive de ella.
    public static void hacerSonarAnimal(Animal animal) {
        animal.emitirSonido();
    }
}