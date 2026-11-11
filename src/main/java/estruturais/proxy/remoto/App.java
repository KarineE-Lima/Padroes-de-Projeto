package estruturais.proxy.remoto;

public class App {
    public static void main(String[] args) {
        ServicoCotacao servicoCotacao = new ProxyRemotoCotacao();
        System.out.println("---------1ª vez---------");
        System.out.println("Cotação dolar: " + servicoCotacao.getCotacaoDolar());
        System.out.println("---------2ª vez---------");
        System.out.println("Cotação dolar 2: " + servicoCotacao.getCotacaoDolar());

    }
}
