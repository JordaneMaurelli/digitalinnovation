package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jordane"
    var cpf: String = "123.123.123-12"
    private set
}

fun main(){
    val jordane = Pessoa()

    println(jordane)
    println(jordane.nome)
    println(jordane.cpf)

}