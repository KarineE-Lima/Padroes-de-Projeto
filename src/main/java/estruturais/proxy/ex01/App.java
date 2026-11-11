package estruturais.proxy.ex01;
//cliente
public class App {
    public static void main(String[] args) {
        ServicoVideo servicoVideo = new ProxyVideoPlataforma();
        System.out.println(servicoVideo.baixarVideo("4K_Batata_cozida", "PREMIUM"));
        System.out.println(servicoVideo.baixarVideo("HD_House_of_cards", "STANDARD"));
        System.out.println(servicoVideo.baixarVideo("4K_Batata_cozida", "STANDARD"));
    }
}
