package Classes

class IngressoVip(valor: Int) : Ingresso(valor = 50) {

    val valorAdicional:Int = 25

    override fun imprimeValor(valor:Int) {
        print("O valor do Ingresso Vip é ${valor + valorAdicional}")
    }
}
