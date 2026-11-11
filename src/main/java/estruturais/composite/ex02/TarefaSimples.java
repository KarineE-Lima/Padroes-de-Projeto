package estruturais.composite.ex02;

// leaf
public class TarefaSimples implements ElementoWorkflow{
    private String name;

    public TarefaSimples(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int executar() {
        System.out.println("[EXECUTANDO TAREFA] " + name);
        return 15;
    }

    @Override
    public void adicionar(ElementoWorkflow elemento) {
        throw new RuntimeException("Operação não suportada!");
    }

    @Override
    public void remover(ElementoWorkflow elemento) {
        throw new RuntimeException("Operação não suportada!");
    }
}
