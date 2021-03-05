class Analista (
    nome: String,
    cpf: String,
    salario: Double
) : FuncionarioAbstract (nome, cpf, salario){
    override fun calculoAuxilio() = salario*0.1

    fun getData() = nome+" - "+cpf+": "+salario+" + "+calculoAuxilio()

}