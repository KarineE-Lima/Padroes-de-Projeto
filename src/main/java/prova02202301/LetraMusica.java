package prova02202301;

import java.util.List;
// decorator: concrete decorator
public class LetraMusica extends ElementoMusica {
    public LetraMusica(Musica musicaInterna, List<String> linhas) {
        super(musicaInterna, linhas);
    }

    @Override
    public String getNome() {
        return musicaInterna.getNome();
    }

    @Override
    public void execute() {
        System.out.print(" com letra");
        reset();
        while (linha < linhas.size())
            play();
    }


}
