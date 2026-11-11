package estruturais.proxy.virtual;

public class App {
    public static void main(String[] args) {
        MatrizDados matrizDados = new ProxyMatrizVirtual();
        matrizDados.exbirMatriz();
    }
}
