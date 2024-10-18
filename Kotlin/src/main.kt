import java.util.Scanner

fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    var num: Int = 10

    do {
        println(num++)
    } while(num < 20)

    println("\n" + num * 2)

    val menssage = """
        
        Slk.
        Noa sabia disso nao karai.
        
        $name
        $num
        ${num + 34}
        ${name.length}
        
    """//.trimIndent()

    println(menssage)

    for (i in 1..6) {
        println("i = $i")
    }

    println("\n" + num)

    if (num == 40) {
        println("\no num e 40")
    } else {
        println("\no num e $num")
    }

    if (num != 20)
        println("\ne 20")
    else
        println("\nsla por")

    val pro1 = "sla"
    val pro2 = "sla"
    val pro3 = "Sla"

    println("\n" + pro1 == pro2)
    println("\n" + pro1.equals(pro3))

}