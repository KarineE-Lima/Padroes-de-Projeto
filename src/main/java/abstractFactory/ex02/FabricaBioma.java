package abstractFactory.ex02;

import java.util.HashMap;
import java.util.Map;

public class FabricaBioma {
    private Map<String, ElementoTerreno> elementos = new HashMap<>();

    public void registrarElemento(String chave){
        elementos.put(chave, new ElementoTerreno() {
            @Override
            public ElementoTerreno clonar() {
                return this;
            }

            @Override
            public void exibir() {
                System.out.println("Exibindo %s.".formatted(chave));
            }
        });
    }
    public void registrarElemento(String chave, ElementoTerreno elemento){
        elementos.put(chave, elemento);
    }
    public ElementoTerreno gerarElemento(String chave){
        ElementoTerreno prototipo = elementos.get(chave);
        if (prototipo == null)
            throw new IllegalArgumentException("Elemento não registrado!");
        return prototipo.clonar();
    }
}
