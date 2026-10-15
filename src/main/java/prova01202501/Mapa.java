package prova01202501;

import prova01202501.enums.Dificuldade;
import prova01202501.enums.Idade;
import prova01202501.enums.Sexo;

import java.util.List;

public record Mapa(
        Sexo sexo,
        Idade idade,
        Dificuldade dificuldade,
        Integer escala,
        Integer eqn,
        PontoGeografico largada,
        PontoGeografico partida,
        List<Prisma> prismas,
        PontoGeografico chegada) {

}
