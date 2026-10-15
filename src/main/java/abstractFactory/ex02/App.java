package abstractFactory.ex02;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        FabricaBioma fabrica = new FabricaBioma();
        List<ElementoTerreno> elementos = new ArrayList<>();
        fabrica.registrarElemento("Pedregulho");
        fabrica.registrarElemento("Arvore carvalho", new ArvoreCarvalho());
        fabrica.registrarElemento("Rocha Arenito", new RochaArenito());
        elementos.addAll(List.of(fabrica.gerarElemento("Pedregulho"), fabrica.gerarElemento("Arvore carvalho"), fabrica.gerarElemento("Rocha Arenito")));
        for (ElementoTerreno e: elementos){
            e.exibir();
        }
    }
}
