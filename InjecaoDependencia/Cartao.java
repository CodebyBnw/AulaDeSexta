package InjecaoDependencia;

public class Cartao extends MetodoPagamento {

    public int parcelas = 0;

    @Override

    public Boolean executarPagamento() {

        // codigo especifico do cartao
        // lembrar do tratamento de exceções

        super.executarPagamento();
        return true;
    }

}
