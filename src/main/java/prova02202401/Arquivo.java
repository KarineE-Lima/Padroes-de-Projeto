package prova02202401;

import java.time.Instant;
import java.util.Date;
// composite: leaf
// proxy: real service
public class Arquivo implements ItemSistemaArquivos{
    private String nome;
    private Date dataCriacao;
    private Long tamanho;
    private boolean protegido;

    public Arquivo(String nome, boolean protegido, Long tamanho) {
        this.dataCriacao = Date.from(Instant.now());
        this.nome = nome;
        this.protegido = protegido;
        this.tamanho = tamanho;
    }

    @Override
    public Long tamanho() {
        return tamanho;
    }

    @Override
    public void ler(Credencial credencial) {
        System.out.println("Lendo arquivo " + nome);
    }

    @Override
    public void adicionar(ItemSistemaArquivos item) {
        throw new RuntimeException("Operação não suportada!");
    }

    @Override
    public void remover(ItemSistemaArquivos item) {
        throw new RuntimeException("Operação não suportada!");
    }

    public boolean isProtegido() {
        return protegido;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public String getNome() {
        return nome;
    }
}
