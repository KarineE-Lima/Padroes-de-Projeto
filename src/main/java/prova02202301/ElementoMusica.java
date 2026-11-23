package prova02202301;

import java.util.ArrayList;
import java.util.List;
// decorator: base decorator
public abstract class ElementoMusica implements Musica{
    protected Musica musicaInterna;
    protected List<String> linhas;
    protected int linha;
    public ElementoMusica(Musica musicaInterna, List<String> linhas){
        this.musicaInterna = musicaInterna;
        this.linha = 0;
        this.linhas = new ArrayList<>(linhas);
    }
    @Override
    public void reset() {
        musicaInterna.reset();
        linha = 0;
    }

    @Override
    public void play() {
        musicaInterna.play();
        System.out.println(linhas.get(linha));
        linha++;
    }

    @Override
    public boolean finish() {
        return linha == linhas.size();
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
