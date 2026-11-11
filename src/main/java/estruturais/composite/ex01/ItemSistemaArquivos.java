package estruturais.composite.ex01;

public interface ItemSistemaArquivos {
    String getName();
    double getTamanhoMB();
    void adicionarItem(ItemSistemaArquivos item);
    void removerItem(ItemSistemaArquivos item);

}
