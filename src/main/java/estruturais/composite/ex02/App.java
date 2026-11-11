package estruturais.composite.ex02;

// Client
public class App {
    public static void main(String[] args) {
        ElementoWorkflow tarefa1 = new TarefaSimples("Rodar testes unitários");
        ElementoWorkflow pipeline = new Pipeline("Step function");
        pipeline.adicionar(new TarefaSimples("Job_Bronze"));
        pipeline.adicionar(new TarefaSimples("Job_Silver"));
        pipeline.adicionar(new TarefaSimples("Job_Gold"));

        System.out.println("Durou: " + tarefa1.executar());
        System.out.println("Durou: " + pipeline.executar());
    }
}
