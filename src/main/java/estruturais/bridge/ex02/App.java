package estruturais.bridge.ex02;
//client
public class App {
    public static void main(String[] args) {
        RelatorioMonitoramento relatorioPerformance = new RelatorioPerformance(new RenderizadorTerminal(), 87, 12);
        RelatorioMonitoramento relatorioSeguranca = new RelatorioSeguranca(new RenderizadorHTML(), 34, true);
        relatorioPerformance.gerarRelatorio();
        relatorioSeguranca.gerarRelatorio();
    }
}
