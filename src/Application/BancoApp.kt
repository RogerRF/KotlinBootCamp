package Application

import Pessoa
import Funcionario
import Banco

fun main(){

    val p1 = Pessoa ("João", "123.456.789-01")
    println( p1.nome+" "+p1.cpf )

    val f1 = Funcionario ("Operador", "012.345.678-90", 1571.54)
    println( f1.nome+" "+f1.cpf+": "+f1.salario )

    val bancoApp = Banco( "One", 12 )
    val bancoApk = bancoApp.copy("Two", 22)

    println( bancoApp.nome + ": " + bancoApp.numero )
    println( bancoApk.getData() )

    ClienteTipo.values().forEach { print( "$it " ) }
    println()
    ClienteTipo.values().forEach { e -> print( "$e " ) }

}