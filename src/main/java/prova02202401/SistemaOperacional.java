package prova02202401;
// client
public class SistemaOperacional {
    public static void sistemaArquivo(){
        ItemSistemaArquivos pasta1 = new Pasta("meus_arquivos");
        ItemSistemaArquivos pasta2 = new Pasta("minhas_pastas");
        ItemSistemaArquivos arquivo1 = new ProxyArquivo("arquivo1", true, 15L);
        ItemSistemaArquivos arquivo2 = new ProxyArquivo("arquivo2", false, 8L);
        Credencial credencial = new Credencial("ADMIN123");
        pasta1.adicionar(arquivo1);
        pasta1.adicionar(arquivo2);
        pasta2.adicionar(pasta1);
        System.out.println("Tamanho da pasta2:" + pasta2.tamanho());
        for (int i = 0; i < 3; i++) {
            arquivo1.ler(credencial);
        }
        arquivo2.ler(null);

    }
    public static void main(String[] args) {
        sistemaArquivo();
    }
}
