package prova01202501.q2;


import prova01202501.q1.ListaPassagensBuilder;

import java.util.ArrayList;
import java.util.List;

public class ListaPassagens implements Cloneable{
    private List<TempoPassagem> tempos;

    public ListaPassagens(){
        tempos = new ArrayList<>();
    }
    public ListaPassagens(ListaPassagens listaPassagens){
        tempos = new ArrayList<>();
        for(TempoPassagem tempo: listaPassagens.tempos)
            tempos.add((TempoPassagem) tempo.clone());
    }
    public void registrarPassagem(TempoPassagem tempoPassagem){
        this.tempos.add(tempoPassagem);
    }
    @Override
    public Cloneable clone(){
        return new ListaPassagens(this);
    }
}
