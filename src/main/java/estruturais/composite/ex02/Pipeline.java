package estruturais.composite.ex02;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Pipeline implements ElementoWorkflow{
    private String name;
    private List<ElementoWorkflow> steps;

    public Pipeline(String name){
        this.name = name;
        steps = new ArrayList<>();
    }
    @Override
    public void adicionar(ElementoWorkflow elemento) {
        steps.add(elemento);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int executar() {
        int tempoExec = 0;
        System.out.println("[INICIANDO PIPELINE] " + name);
        for (ElementoWorkflow elemento: steps){
            tempoExec += elemento.executar();
        }
        System.out.println("[FIM PIPELINE] " + name + " (Tempo total:" + tempoExec + "s)");
        return tempoExec;
    }

    @Override
    public void remover(ElementoWorkflow elemento) {
        steps.remove(elemento);
    }
}
