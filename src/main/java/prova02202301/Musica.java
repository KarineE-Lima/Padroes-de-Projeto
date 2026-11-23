package prova02202301;
// composite: component
// decorator: component
public interface Musica {
    String getNome();
    void execute();
    void reset();
    void play();
    boolean finish();
    void randomize();
    void adicionarItem(Musica musica);
    void removerItem(Musica musica);
}
