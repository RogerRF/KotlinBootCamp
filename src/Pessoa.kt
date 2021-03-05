class Pessoa {
    var nome: String = "Roger"

    var cpf: String = "123.456.789.01"; private set
}

fun main () {

    val p = Pessoa()
    p.nome = "rochison"

    println(p)
    println(p.nome)
    println(p.cpf)

}