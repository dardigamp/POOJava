public class Auto {
    // Atributos (estado)
    private String marca;
    private String modelo;

    // Constructor
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método (comportamiento)
    public void acelerar() {
        System.out.println("El coche " + marca + " " + modelo + " está acelerando.");
    }

    // Getters y Setters (Encapsulación)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}