package prova01202501.q1;

import prova01202501.enums.Dificuldade;
import prova01202501.enums.Idade;
import prova01202501.enums.Sexo;

public interface OrientacaoBuilder {

    OrientacaoBuilder withSexo(Sexo sexo);
    OrientacaoBuilder withIdade(Idade idade);
    OrientacaoBuilder withDificuldade(Dificuldade dificuldade);
}
