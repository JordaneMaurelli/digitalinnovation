package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val Lucas = Cliente(
        nome = "Luca Silva",
        cpf = "123.456.789-00",
        clienteTipo = ClienteTipo.PF,
        "123456"
    )
    println(Lucas)
    TesteAutenticacao().autentitaca(Lucas)
}
