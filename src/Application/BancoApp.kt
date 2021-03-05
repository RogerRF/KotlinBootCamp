package Application

import Banco

fun main(){

    val bancoApp = Banco( "One", 12 )
    val bancoApk = bancoApp.copy("Two", 22)

    println( bancoApp.nome + ": " + bancoApp.numero )
    println( bancoApk.getData() )

    ClienteTipo.values().forEach { print( "$it " ) }
    println()
    ClienteTipo.values().forEach { e -> print( "$e " ) }

}