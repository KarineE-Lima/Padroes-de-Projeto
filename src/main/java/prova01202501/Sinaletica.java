package prova01202501;

import prova01202501.enums.Dificuldade;
import prova01202501.enums.Idade;
import prova01202501.enums.Sexo;

public record Sinaletica(
        Sexo sexo,
        Idade idade,
        Dificuldade dificuldade,
        double distancia,
        double desnivel
) {

}
