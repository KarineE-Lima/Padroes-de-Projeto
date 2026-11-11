package estruturais.composite.ex01;

public class Arquivo implements ItemSistemaArquivos{
    private String nome;
    private double tamanho;

    public Arquivo(String nome, double tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public String getName() {
        return nome;
    }

    @Override
    public double getTamanhoMB() {
        return tamanho;
    }

    @Override
    public void adicionarItem(ItemSistemaArquivos item) {
        throw new RuntimeException("Não é possivel adicionar item aos arquivos");
    }

    @Override
    public void removerItem(ItemSistemaArquivos item) {
        throw new RuntimeException("Não é possivel remover item dos arquivos");
    }
}
