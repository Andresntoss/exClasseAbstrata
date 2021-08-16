package Classes

class IngressoPadrao(valor: Int) : Ingresso(valor) {

    override fun imprimeValor() {
        println("O valor do Ingresso Padrão é ${valor}")
    }


}