package prova02202401;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// composite: composite
public class Pasta implements ItemSistemaArquivos{
    private String nome;
    private Date dataCriacao;
    private List<ItemSistemaArquivos> itens;

    public Pasta(String nome) {
        this.dataCriacao = Date.from(Instant.now());
        this.itens = new ArrayList<>();
        this.nome = nome;
    }

    @Override
    public Long tamanho() {
        Long tamanho = 0L;
        for(ItemSistemaArquivos item: itens)
            tamanho += item.tamanho();
        return tamanho;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void ler(Credencial credencial) {
        for(ItemSistemaArquivos item: itens)
            item.ler(credencial);
    }

    @Override
    public void adicionar(ItemSistemaArquivos item) {
        itens.add(item);
    }

    @Override
    public void remover(ItemSistemaArquivos item) {
        itens.remove(item);
    }
}
