class Funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: Double
):Pessoa(nome, cpf) {

}