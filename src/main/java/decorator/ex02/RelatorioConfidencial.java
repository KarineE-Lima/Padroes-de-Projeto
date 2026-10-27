package decorator.ex02;

public class RelatorioConfidencial extends RelatorioDecorator{
    public RelatorioConfidencial(Relatorio relatorio){
        super(relatorio);
    }
    @Override
    public String gerarConteudo() {
        return "[CONFIDENCIAL]" + relatorio.gerarConteudo();
    }
}
