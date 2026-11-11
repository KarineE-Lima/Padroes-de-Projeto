package estruturais.flyweight.ex01;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
public class TipoArvoreFactory {
    private Map<String, TipoArvore> tipos;
    public TipoArvoreFactory(){
        tipos = new HashMap<>();
    }

    public TipoArvore getTipoArvore(String nome, String cor, String textura){
        String chave = nome + ":" + cor + ":" + textura;

        if (!tipos.containsKey(chave))
            tipos.put(chave, new TipoArvore(nome, cor, textura));

        return tipos.get(chave);
    }
    public int getQtd(){
        return tipos.size();
    }
}
