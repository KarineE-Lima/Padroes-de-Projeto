package builder.ex03;

public class RelatorioPDFBuilder extends RelatorioBuilder{

    @Override
    public RelatorioBuilder buildCabecalho(String titulo) {
        this.titulo = "[PDF-HEADER]\n" + titulo;
        return this;
    }

    @Override
    public RelatorioBuilder buildCCorpo(String conteudo) {
        this.conteudo = "[PDF-PAGE-BREAK]\n" +conteudo;
        return this;
    }

    @Override
    public RelatorioBuilder buildRodape(String rodape) {
        this.rodape = "[PDF-FOOTER]\n" + rodape;
        return this;
    }
}
