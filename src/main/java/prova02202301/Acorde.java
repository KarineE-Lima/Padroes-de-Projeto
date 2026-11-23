package prova02202301;

import java.util.List;
// decorator: concrete decorator
public class Acorde extends ElementoMusica {
    public Acorde(Musica musicaInterna, List<String> linhas){
        super(musicaInterna, linhas);
    }

    @Override
    public String getNome() {
        return musicaInterna.getNome();
    }

    @Override
    public void execute() {
        System.out.println(" com acorde");
        reset();
        while (linha < linhas.size())
            play();
    }


}
