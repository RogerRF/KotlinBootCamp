class Gerente (
    nome: String,
    cpf: String,
    salario: Double
) : FuncionarioAbstract (nome, cpf, salario){
    override fun calculoAuxilio() = salario*0.2

    fun getData() = nome+" - "+cpf+": "+salario+" + "+calculoAuxilio()

    override fun toString(): String {
        return nome+" - "+cpf+": "+salario+" + "+calculoAuxilio()+" = "+(salario+calculoAuxilio())
    }
}