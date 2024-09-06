package InjecaoDependencia;

public class MetodoPagamento implements IMetodoPagamento {

    Double valor = 0.0;
    String situacao = "";

    public Boolean executarPagamento() {
        this.situacao = "Pago";
        return true;
    }

}
