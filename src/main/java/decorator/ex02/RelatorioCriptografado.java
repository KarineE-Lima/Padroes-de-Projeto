package decorator.ex02;

public class RelatorioCriptografado extends RelatorioDecorator{
    public RelatorioCriptografado(Relatorio relatorio){
       super(relatorio);
    }

    @Override
    public String gerarConteudo() {
        return new StringBuilder(relatorio.gerarConteudo()).reverse().toString();
    }
}
