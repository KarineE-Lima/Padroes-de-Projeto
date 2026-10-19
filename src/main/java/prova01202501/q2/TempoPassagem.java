package prova01202501.q2;

import prova01202501.Prisma;

import java.time.LocalDate;

public class TempoPassagem implements Cloneable{
    private Prisma prisma;
    private LocalDate tempo;

    public TempoPassagem(){

    }
    public TempoPassagem(TempoPassagem tempoPassagem){
        this.prisma = tempoPassagem.prisma;
        this.tempo = tempoPassagem.tempo;
    }

    public Cloneable clone(){
        return new TempoPassagem(this);
    }
    public Prisma getPrisma(){
        return prisma;
    }
    public LocalDate getTempo(){
        return tempo;
    }
}
