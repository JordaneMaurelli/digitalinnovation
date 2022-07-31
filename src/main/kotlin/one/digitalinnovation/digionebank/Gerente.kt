package one.digitalinnovation.digionebank

class Gerente(nome: String,
              cpf: String,
              val senha: String,
              salario: Double) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {

    override fun calculoAuxilio(): Double = salario *0.4
    override fun login(): Boolean = "senha123" == senha
}