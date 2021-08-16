import Classes.IngressoPadrao
import Classes.IngressoVip
import java.util.*

fun main() {
    val padrao = IngressoPadrao(valor = 0)
    val vip = IngressoVip(valor = 0)
    val scanner = Scanner(System.`in`)
    println("Olá, bem vindo!")
    println(
        """
        Por favor, informe o ingresso desejado:
        1 - Ingresso padrão
        2 - Ingresso Vip
        """.trimIndent()
    )
    val retornoInicial = scanner.nextInt()

    if (retornoInicial == 1) {
        println("Você escolheu o Ingresso padrão")
         padrao.imprimeValor(50)
    } else if (retornoInicial == 2) {
        println("Você escolheu o Ingresso Vip")
        vip.imprimeValor(51)
    } else {
        println("Número inválido")
        return main()
    }
}