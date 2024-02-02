class Empleado (nombre: String, edad: Int, salarioBase: Double, porcentajeImpuestos: Double): Persona(nombre, edad) {

    val salarioBase: Double = salarioBase

    constructor(nombre: String, edad: Int, salarioBase: Int, porcentajeImpuestos: Double): this(nombre, edad, salarioBase.toInt(), porcentajeImpuestos) {
        
    }
}