package prova01202501.q1;

import prova01202501.Mapa;
import prova01202501.PontoGeografico;
import prova01202501.Prisma;
import prova01202501.enums.Dificuldade;
import prova01202501.enums.Idade;
import prova01202501.enums.Sexo;

import java.util.List;

public class MapaBuilder implements OrientacaoBuilder{
    private Sexo sexo;
    private Idade idade;
    private Dificuldade dificuldade;
    private Integer escala;
    private Integer eqn;
    private PontoGeografico largada;
    private PontoGeografico partida;
    private List<Prisma> prismas;
    private PontoGeografico chegada;


    public MapaBuilder withSexo(Sexo sexo) {
        this.sexo = sexo;
        return this;
    }


    public MapaBuilder withIdade(Idade idade) {
        this.idade = idade;
        return this;
    }


    public MapaBuilder withDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
        return this;
    }

    public MapaBuilder withEscala(Integer escala){
        this.escala = escala;
        return this;
    }
    public MapaBuilder withEqn(Integer eqn){
        this.eqn = eqn;
        return this;
    }
    public MapaBuilder withLargada(PontoGeografico largada){
        this.largada = largada;
        return this;
    }
    public MapaBuilder withPartida(PontoGeografico partida){
        this.partida = partida;
        return this;
    }
    public MapaBuilder addPrismas(Prisma prisma){
        prismas.add(prisma);
        return this;
    }
    public MapaBuilder withChegada(PontoGeografico chegada){
        this.chegada = chegada;
        return this;
    }
    public Mapa build(){
        return new Mapa(sexo, idade, dificuldade, escala, eqn, largada, partida, prismas, chegada);
    }
}
