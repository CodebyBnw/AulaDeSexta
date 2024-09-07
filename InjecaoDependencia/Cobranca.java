package InjecaoDependencia;

public class Cobranca {

    private IMetodoPagamento MetodoPagamento;

    Cobranca(IMetodoPagamento metodopgto) {
        this.MetodoPagamento = metodopgto;

    }

    public Boolean Cobrar() {

        return this.MetodoPagamento.executarPagamento();
    }

    // Injeção via setter
    public void setMetodoCobranca(IMetodoPagamento metodopgto) {
        this.MetodoPagamento = metodopgto;
    }
}