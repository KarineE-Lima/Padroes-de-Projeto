package estruturais.flyweight.ex02;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        EstiloFonteFactory estiloFonteFactory = new EstiloFonteFactory();
        List<Caractere> caracteres = new ArrayList<>();
        String frase = "Eu como batata";
        char [] arrayCarac = frase.toCharArray();
        for (int i = 0; i < frase.length(); i++) {
            caracteres.add(new Caractere(arrayCarac[i], i, 0, estiloFonteFactory.getEstiloFonte("Arial", 12, true)));
        }
        for (Caractere c: caracteres)
            c.desenharCaractere();
    }
}
