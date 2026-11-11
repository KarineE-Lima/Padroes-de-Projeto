package estruturais.composite.ex01;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ItemSistemaArquivos{
    private String nome;
    private List<ItemSistemaArquivos> itens;
    public Pasta(String nome){
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemSistemaArquivos item){
        itens.add(item);
    }
    public void removerItem(ItemSistemaArquivos item){
        itens.remove(item);
    }

    @Override
    public String getName() {
        return nome;
    }

    @Override
    public double getTamanhoMB() {
        return itens.stream().mapToDouble(ItemSistemaArquivos::getTamanhoMB).sum();
    }
}
