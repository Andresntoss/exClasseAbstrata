package Classes

class IngressoPadrao(valor: Int) : Ingresso(valor = 50) {

    override fun imprimeValor(valor:Int) {
        println("O valor do Ingresso Padrão é ${valor}")
    }


}