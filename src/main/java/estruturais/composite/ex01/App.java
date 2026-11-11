package estruturais.composite.ex01;

public class App {
    public static void main(String[] args) {
        ItemSistemaArquivos pasta = new Pasta("Minha pasta");
        ItemSistemaArquivos subpasta = new Pasta("Minha subpasta");
        ItemSistemaArquivos arquivo1 = new Arquivo("documento1.txt", 5);
        ItemSistemaArquivos arquivo2 = new Arquivo("pograma.exe", 200);
        subpasta.adicionarItem(arquivo2);
        subpasta.adicionarItem(arquivo1);
        pasta.adicionarItem(subpasta);
        System.out.println("Tamanho da pasta " + pasta.getName() + ": " + pasta.getTamanhoMB() + "MB");
    }
}
