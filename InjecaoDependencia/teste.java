package InjecaoDependencia;

public class teste {

    public static void main(String[] args) {

        // construir um boleto
        Boleto invoice = new Boleto();
        invoice.valor = 1000.0;
        invoice.nossoNumero = "123";

        // construir um objeto de cobrança

        Cobranca Cobrador = new Cobranca(invoice);
        Cobrador.Cobrar();

        // contruir um cartão de Crédito
        Cartao CC = new Cartao();
        CC.parcelas = 10;
        CC.valor = 1000.0;
        Cobrador.setMetodoCobranca(CC);
        Cobrador.Cobrar();
    }

}
