package estruturais.composite.ex02;

// component
public interface ElementoWorkflow {
    String getName();
    int executar();
    void adicionar(ElementoWorkflow elemento);
    void remover(ElementoWorkflow elemento);
}
