package decorator.ex02;

public class RelatorioBase implements Relatorio{
    private String dados;

    public RelatorioBase(String dados){
        this.dados = dados;
    }

    @Override
    public String gerarConteudo() {
        return "Dados Financeiros: " + dados;
    }
}
