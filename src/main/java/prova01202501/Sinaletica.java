package prova01202501;

import prova01202501.enums.Dificuldade;
import prova01202501.enums.Idade;
import prova01202501.enums.Sexo;

public abstract class Sinaletica {
    private Sexo sexo;
    private Idade idade;
    private Dificuldade dificuldade;
    private double distancia;
    private double desnivel;

    public Sinaletica(Sexo sexo, Idade idade, Dificuldade dificuldade){
        this.sexo = sexo;
        this.dificuldade = dificuldade;
        this.idade = idade;
    }



}
