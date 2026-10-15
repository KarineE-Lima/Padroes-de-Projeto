package factoryMethod.ex02;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Figura> figuras = List.of(
                new Figura(), // Usará o ManipuladorPadrao
                new FiguraTexto()     // Usará o ManipuladorTexto
        );

        for (Figura figura : figuras) {
            figura.aoClicarEArrastar();
        }
    }
}
