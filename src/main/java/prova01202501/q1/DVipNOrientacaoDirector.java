package prova01202501.q1;

import prova01202501.*;
import prova01202501.q2.ListaPassagens;
import prova01202501.enums.Dificuldade;
import prova01202501.enums.Idade;
import prova01202501.enums.Sexo;


import java.time.LocalDate;

public class DVipNOrientacaoDirector implements OrientacaoDirector{
    @Override
    public Mapa buildMapa(MapaBuilder builder) {
        return builder.withSexo(Sexo.D)
                .withIdade(Idade.VIP)
                .withDificuldade(Dificuldade.N)
                .withEqn(5)
                .withEscala(7500)
                .withPartida(new PontoGeografico(0.0,-12.99747, -38.47435))
                .withChegada(new PontoGeografico(0.0, -12.99825, -38.47526))
                .addPrismas(new Prisma(31, new PontoGeografico(0.0, -12.99747, -38.47435)))
                .addPrismas(new Prisma(32, new PontoGeografico(0.0, -12.99825, -38.47526)))
                .build();
    }

    @Override
    public Sinaletica buildSinaletica(SinaleticaBuilder builder) {
        return builder.withSexo(Sexo.D)
                .withIdade(Idade.VIP)
                .withDificuldade(Dificuldade.N)
                .build();
    }

    @Override
    public ListaPassagens buildListaPassagens(ListaPassagensBuilder builder) {

        return builder.addTempo(new TempoPassagem(new Prisma(999, new PontoGeografico(0.0, -12.99825, -38.47526)), LocalDate.now())).build();
    }
}
