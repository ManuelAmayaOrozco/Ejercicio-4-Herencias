fun main() {
    println("-----PRUEBAS CON PERSONA-----")
    val persona = Persona("Pedro", 35)
    println(persona)
    println(persona.celebrarCumple())

    println()

    println("-----PRUEBAS CON EMPLEADO-----")
    val empleado = Empleado("Jorge", 24, 300, 25)
    println(empleado)
    println(empleado.celebrarCumple())
    println(empleado.trabajar())

    println()

    println("-----PRUEBAS CON GERENTE-----")
    val gerente = Gerente("Adán", 34, 500.0, 33.99, 1000.0, true)
    println(gerente)
    println(gerente.celebrarCumple())
    println(gerente.trabajar())
    println(gerente.administrar())
}