package builder.ex03;

public abstract class RelatorioBuilder {
    protected String titulo;
    protected String conteudo;
    protected String rodape;

    public abstract RelatorioBuilder buildCabecalho(String titulo);
    public abstract RelatorioBuilder buildCCorpo(String conteudo);
    public abstract RelatorioBuilder buildRodape(String rodape);

    public Relatorio getResult(){
        return new Relatorio(this);
    }

}
