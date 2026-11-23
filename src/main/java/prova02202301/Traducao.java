package prova02202301;

import java.util.List;
// decorator: concrete decorator
public class Traducao extends ElementoMusica{
    private String idioma;
    public Traducao(Musica musicaInterna, List<String> linhas, String idioma) {

        super(musicaInterna, linhas);
        this.idioma = idioma;
    }

    @Override
    public String getNome() {
        return musicaInterna.getNome();
    }

    @Override
    public void execute() {
        System.out.print(" com tradução em " + idioma);
        reset();
        while (linha < linhas.size())
            play();
    }


}
