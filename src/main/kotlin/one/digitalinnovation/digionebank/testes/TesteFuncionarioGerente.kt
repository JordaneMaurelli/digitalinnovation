package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {

    val Fabio = Analista (nome = "Fabio Augusto" , cpf = "12345678", salario = 5000.00)
    ImprimeRelatorioFuncionario.imprime(Fabio)
}

