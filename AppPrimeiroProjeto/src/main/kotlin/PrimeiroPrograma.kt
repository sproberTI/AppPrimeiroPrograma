fun main() {
    //Meu Primeiro Programa
    println("1º Programa Kotlin, Roberto Santos.")

    println("Qual é o seu nome? ")

    var nome: String = readLine()!!.toString()

    println("Olá, $nome. Muito prazer...")

    println("Qual é a sua idade? ")

    var idade: Int = readLine()!!.toInt()

    println("Sua idade é $idade")

    println()

    println("Seu nome é $nome e você tem $idade anos.")

}