package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jordane"
    var cpf: String = "123.123.123-12"
    private set

    constructor()
    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val jordane = Pessoa()

    println(jordane.pessoaInfo())
}