package estruturais.proxy.protecao;

public class App {
    public static void main(String[] args) {
        ServicoFolha servicoFolha1 = new ProxyProtecaoFolha("ANALISTA");
        ServicoFolha servicoFolha2 = new ProxyProtecaoFolha("DIRETOR");
        servicoFolha2.alterarSalario("ACD8R9", 2897.78);
        servicoFolha1.alterarSalario("ABC123", 3450.80);
    }
}
