open class Persona (val nombre: String, var edad: Int) {

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }

    fun celebrarCumple(): String {
        edad  += 1
        return "Feliz cumpleaños $nombre! Ahora tienes $edad años."
    }
}