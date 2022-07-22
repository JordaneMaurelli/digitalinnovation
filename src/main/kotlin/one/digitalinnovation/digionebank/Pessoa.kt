package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jordane"
    var cpf: String = "123.123.123-12"
}

fun main(){
    val jordane = Pessoa()

    println(jordane.nome)
    println(jordane.cpf)

}