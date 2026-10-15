package builder.ex03;

public class App {
    private static void run(){
        RelatorioDirector director = new RelatorioDirector();

// 1. Gera um relatório em HTML usando a mesma receita do Director
        RelatorioHTMLBuilder htmlBuilder = new RelatorioHTMLBuilder();
        Relatorio html = director.construct(htmlBuilder, "Vendas Outubro", "Total: R$ 50.000");;

// 2. Gera o mesmo relatório em PDF mudando APENAS o builder!
        RelatorioPDFBuilder pdfBuilder = new RelatorioPDFBuilder();
        Relatorio pdf = director.construct(pdfBuilder, "Vendas Outubro", "Total: R$ 50.000");;

        html.exibir();
        pdf.exibir();
    }
    public static void main(String[] args) {
        run();
    }
}
