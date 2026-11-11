package estruturais.bridge.ex02;
//Refined Abstraction
public class RelatorioPerformance extends RelatorioMonitoramento{
    private double usoCPU;
    private double usoRAM;

    public RelatorioPerformance(RenderizadorSaida renderizador, double usoCPU, double usoRAM){
        super(renderizador);
        this.usoCPU = usoCPU;
        this.usoRAM = usoRAM;
    }
    @Override
    public void gerarRelatorio() {
        renderizador.desenharTitulo("Relatório de Performance");
        renderizador.desenharMetrica("Uso de CPU", usoCPU + "%");
        renderizador.desenharMetrica("Uso de RAM", usoRAM + "GB");
        renderizador.desenharRodape("STATUS: ALERTA DE CARGA");
    }
}
