package prova02202301;

// composite: leaf
// decorator: concrete component
public class MusicaBase implements Musica{
    private String nome;

    public MusicaBase(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void execute() {
        System.out.print("Executando música " + nome);
    }

    @Override
    public void reset() {

    }

    @Override
    public void play() {

    }

    @Override
    public boolean finish() {
        return true;
    }

    @Override
    public void randomize() {
        throw new RuntimeException("Operação não suportada");
    }


    @Override
    public void adicionarItem(Musica musica) {
        throw new RuntimeException("Operação não suportada");
    }

    @Override
    public void removerItem(Musica musica) {
        throw new RuntimeException("Operação não suportada");
    }
}
