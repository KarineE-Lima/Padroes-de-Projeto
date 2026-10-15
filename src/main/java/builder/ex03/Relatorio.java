package builder.ex03;

public class Relatorio {
    private String titulo;
    private String conteudo;
    private String rodape;

    public Relatorio(RelatorioBuilder relatorioBuilder) {
        this.conteudo = relatorioBuilder.conteudo;
        this.rodape = relatorioBuilder.rodape;
        this.titulo = relatorioBuilder.titulo;
    }

    public void exibir(){
        System.out.println( titulo + "\n"
                + conteudo + "\n"
                + rodape
        );
    }
}
