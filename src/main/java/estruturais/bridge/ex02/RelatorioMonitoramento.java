package estruturais.bridge.ex02;

//Abstraction
public abstract class RelatorioMonitoramento {
    protected RenderizadorSaida renderizador;
    public RelatorioMonitoramento(RenderizadorSaida renderizador){
        this.renderizador = renderizador;
    }

    public abstract void gerarRelatorio();

}
