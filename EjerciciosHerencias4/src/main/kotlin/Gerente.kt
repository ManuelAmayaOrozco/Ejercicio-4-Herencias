class Gerente (nombre: String, edad: Int, salarioBase: Double, porcentajeImpuestos: Double = 33.99, val bonus: Double, val exentoImpuestos: Boolean = false): Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {

    override fun calcularSalario(): Double {
        if (exentoImpuestos) {
            val salario = salarioBase + bonus
            return salario
        }
        else {
            val salario = ((salarioBase + bonus) * porcentajeImpuestos) / 100
            return salario
        }
    }

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad, Salario: ${"%.2f".format(calcularSalario())}€, Bonus: $bonus€, Exento Impuestos: ${if (exentoImpuestos) { "Si" } else { "No" }}"
    }

    fun administrar(): String {
        return "$nombre está administrando la empresa."
    }
}