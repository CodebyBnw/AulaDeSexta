package InjecaoDependencia;

public class Boleto extends MetodoPagamento {

    public String nossoNumero = "";

    @Override

    public Boolean executarPagamento() {
        super.executarPagamento();
        return true;
    }
}