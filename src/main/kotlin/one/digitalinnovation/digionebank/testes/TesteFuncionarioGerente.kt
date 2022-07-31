package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {

    val Fabio = Gerente (nome = "Fabio Augusto" , cpf = "12345678", salario = 5000.00, senha = "senha123" )
    ImprimeRelatorioFuncionario.imprime(Fabio)

    TesteAutenticacao().autentitaca(Fabio)
}

