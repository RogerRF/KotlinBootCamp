class Pessoa {
    var nome: String = "Roger"
    var cpf: String = "123.456.789.01"
    private set

    //constructor()

    fun getData() = cpf +" - "+ nome
}

fun main () {

    val p = Pessoa()

    println(p)
    println(p.getData())

}