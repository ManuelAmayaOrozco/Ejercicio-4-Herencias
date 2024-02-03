open class Empleado (nombre: String, edad: Int, var salarioBase: Double, val porcentajeImpuestos: Double = 10.0): Persona(nombre, edad) {

    open fun calcularSalario(): Double {
        val salario = (salarioBase * porcentajeImpuestos) / 100
        return salario
    }

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad, Salario: ${"%.2f".format(calcularSalario())}€"
    }

    fun trabajar(): String {
       return "$nombre está trabajando en la empresa."
    }
}