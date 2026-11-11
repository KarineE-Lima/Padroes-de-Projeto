package estruturais.bridge.ex02;
// implementor
public interface RenderizadorSaida {
    void desenharTitulo(String titulo);
    void desenharMetrica(String chave, String valor);
    void desenharRodape(String status);
}
