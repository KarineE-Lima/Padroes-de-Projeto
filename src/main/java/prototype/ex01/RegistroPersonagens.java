package prototype.ex01;

import java.util.HashMap;
import java.util.Map;

public class RegistroPersonagens {
    private Map<String, Personagem> personagens = new HashMap<>();

    public void registrarPersonagem(String nome, Personagem prototipo){
        personagens.put(nome, prototipo);
    }

    public Personagem clonar(String nome){
        Personagem personagem = personagens.get(nome);
        if(personagem == null){
            throw new IllegalArgumentException("Protótipo não encotrado: " + nome);
        }
        return personagem.clonar();
    }


}
