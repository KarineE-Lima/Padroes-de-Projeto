package prova02202301;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
// composite : composite
public class Playlist implements Musica{
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        musicas = new ArrayList<>();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void execute() {
        System.out.println("Executando playlist " + nome);
        for(Musica m: musicas){
            m.execute();
        }
    }

    @Override
    public void reset() {
        throw new RuntimeException("Operação não suportada");
    }

    @Override
    public void play() {
        throw new RuntimeException("Operação não suportada");
    }

    @Override
    public boolean finish() {
        throw new RuntimeException("Operação não suportada");
    }

    @Override
    public void randomize() {
        Random random = new Random();
        int index = random.nextInt(musicas.size());
        musicas.get(index).execute();
    }

    @Override
    public void adicionarItem(Musica musica) {
        musicas.add(musica);
    }

    @Override
    public void removerItem(Musica musica) {
        musicas.remove(musica);
    }
}
