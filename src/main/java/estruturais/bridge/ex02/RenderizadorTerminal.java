package estruturais.bridge.ex02;
//concrete implementor
public class RenderizadorTerminal implements RenderizadorSaida {
    @Override
    public void desenharTitulo(String titulo) {
        System.out.println("========= " + titulo.toUpperCase() + " =========");
    }

    @Override
    public void desenharMetrica(String chave, String valor) {
        System.out.println("[METRICA] " + chave + ": " + valor);
    }

    @Override
    public void desenharRodape(String status) {
        System.out.println("-------- " + status + "--------");
    }
}
