abstract class FuncionarioAbstract (
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    abstract fun calculoAuxilio()

}