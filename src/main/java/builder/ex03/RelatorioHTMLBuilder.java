package builder.ex03;

public class RelatorioHTMLBuilder extends RelatorioBuilder{

    @Override
    public RelatorioBuilder buildCabecalho(String titulo) {
        titulo = "<h1>" + titulo + "<h1>";
        this.titulo = titulo;
        return this;
    }

    @Override
    public RelatorioBuilder buildCCorpo(String conteudo) {
        this.conteudo = "<p>" + conteudo + "</p>";
        return this;
    }

    @Override
    public RelatorioBuilder buildRodape(String rodape) {
        this.rodape = "<footer>" + rodape + "</footer>";
        return this;
    }

}
