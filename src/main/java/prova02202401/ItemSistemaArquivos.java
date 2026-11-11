package prova02202401;
// composite: component
// proxy: service
public interface ItemSistemaArquivos {
    Long tamanho();
    void ler(Credencial credencial);
    void adicionar(ItemSistemaArquivos item);
    void remover(ItemSistemaArquivos item);
}
