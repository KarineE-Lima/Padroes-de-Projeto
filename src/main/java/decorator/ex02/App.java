package decorator.ex02;

public class App {
    public static void run(){
        Relatorio relatorio = new RelatorioBase("Vendas de Agosto: 50.874,97.");
        relatorio = new RelatorioConfidencial(relatorio);
        relatorio = new RelatorioCriptografado(relatorio);
        System.out.println(relatorio.gerarConteudo());
    }
    public static void main(String[] args) {
        run();
    }
}
