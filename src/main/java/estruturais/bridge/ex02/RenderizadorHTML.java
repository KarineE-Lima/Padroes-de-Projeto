package estruturais.bridge.ex02;
//concrete implementor
public class RenderizadorHTML implements RenderizadorSaida {
    @Override
    public void desenharMetrica(String chave, String valor) {
        System.out.println("<p><b>" + chave + ":</b> " + valor + "</p>");
    }

    @Override
    public void desenharTitulo(String titulo) {
        System.out.println("<h1>" + titulo + "</h1>");
    }

    @Override
    public void desenharRodape(String status) {
        System.out.println("<footer>" + status + "</footer>");
    }
}
