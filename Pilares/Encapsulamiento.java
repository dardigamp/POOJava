class CuentaBancaria {
    // Atributo inaccesible desde el exterior directamente
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        }
    }

    // Getter: Permite leer el saldo de forma segura
    public double getSaldo() {
        return this.saldo;
    }

    // Setter: Modifica el saldo aplicando reglas de validación de negocio
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + this.saldo);
        } else {
            System.out.println("Error: No puedes depositar cantidades negativas.");
        }
    }
}