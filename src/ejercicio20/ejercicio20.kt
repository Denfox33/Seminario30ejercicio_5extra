package ejercicio20

//Ejercicio 20: Crea una función que calcule el factorial de un número.

fun factorail( numero: Int):Int{
    var factorial=1;
    for ( i in 1.. numero  ){  //revisar

        factorial*= i;
    }
    return factorial;
}
fun main () {

    val numfactorial= 5
    val resfacto = factorail(numfactorial)
    println("EL factoraial de $numfactorial es $resfacto")
}
