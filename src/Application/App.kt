package Application

import Analista
import Gerente


fun main (){

    var f1 = Analista("Zé\t","000.123.000-99",1000.00)
    var f2 = Gerente("Sr.\t","000.111.000-01",2000.00)

    println(f1.getData())
    println(f2.toString())

}