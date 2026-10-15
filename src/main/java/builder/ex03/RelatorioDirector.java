package builder.ex03;

public class RelatorioDirector {
    public Relatorio construct(RelatorioBuilder builder, String titulo, String corpo){
        return builder.buildCabecalho(titulo)
                .buildCCorpo(corpo)
                .buildRodape("Relatório Gerado Automaticamente - Confidencial")
                .getResult();
    }

}
