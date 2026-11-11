package estruturais.flyweight.ex02;

import java.util.HashMap;
import java.util.Map;

public class EstiloFonteFactory {
    private Map<String, EstiloFonte> estilos;
    public EstiloFonteFactory(){
        estilos = new HashMap();
    }
    public EstiloFonte getEstiloFonte(String nomeFonte, int tamanho, boolean negrito){
        String chave = nomeFonte + "_" + tamanho + "_" + negrito;
        if(!estilos.containsKey(chave))
            estilos.put(chave, new EstiloFonte(nomeFonte, tamanho, negrito));
        return estilos.get(chave);
    }
}
