package Classes

class IngressoVip(valor: Int) : Ingresso(valor) {

    val valorAdicional:Int = 25

    override fun imprimeValor() {
        print("O valor do Ingresso Vip é ${valor + valorAdicional}")
    }
}
