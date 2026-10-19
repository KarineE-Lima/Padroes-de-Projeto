package prova01202501.q1;

import prova01202501.TempoPassagem;
import prova01202501.q2.ListaPassagens;

import java.util.List;

public class ListaPassagensBuilder {
    private List<TempoPassagem> tempos;
    public ListaPassagensBuilder addTempo(TempoPassagem tempo){
        this.tempos.add(tempo);
        return this;
    }
    public ListaPassagens build(){
        return new ListaPassagens((ListaPassagens) tempos);
    }
}
