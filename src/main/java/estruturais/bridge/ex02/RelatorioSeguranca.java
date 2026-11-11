package estruturais.bridge.ex02;
//Refined Abstraction
public class RelatorioSeguranca extends RelatorioMonitoramento{
    private int tentativasInvasao;
    private boolean firewall;
    public RelatorioSeguranca(RenderizadorSaida renderizador, int tentativasInvasao, boolean firewall) {
        super(renderizador);
        this.tentativasInvasao = tentativasInvasao;
        this.firewall = firewall;
    }

    @Override
    public void gerarRelatorio() {
        renderizador.desenharTitulo("Relatório de Segurança");
        renderizador.desenharMetrica("Tentativas de invasão", tentativasInvasao + "");
        renderizador.desenharMetrica("Firewall", firewall? "Ativo" : "Desativo");
        renderizador.desenharRodape("STATUS: SISTEMA SEGURO");
    }
}
