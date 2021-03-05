data class Banco(
    val nome: String,
    val numero: Int){
    fun getData() = nome+", "+numero
}
