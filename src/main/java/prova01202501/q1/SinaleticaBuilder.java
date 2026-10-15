package prova01202501.q1;

import prova01202501.Sinaletica;
import prova01202501.enums.Dificuldade;
import prova01202501.enums.Idade;
import prova01202501.enums.Sexo;

public class SinaleticaBuilder{
    private Sexo sexo;
    private Idade idade;
    private Dificuldade dificuldade;
    private Double distancia;
    private Double desnivel;

    public SinaleticaBuilder withDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
        return this;
    }

    public SinaleticaBuilder withSexo(Sexo sexo) {
        this.sexo = sexo;
        return null;
    }

    public SinaleticaBuilder withIdade(Idade idade) {
        this.idade = idade;
        return null;
    }

    public SinaleticaBuilder withDistancia(Double distancia){
        this.distancia = distancia;
        return this;
    }
    public SinaleticaBuilder withDesnivel(Double desnivel){
        this.desnivel = desnivel;
        return this;
    }
    public Sinaletica build(){
        return new Sinaletica(sexo, idade, dificuldade, distancia, desnivel);
    }
}
