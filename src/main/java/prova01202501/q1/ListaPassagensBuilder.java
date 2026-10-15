package prova01202501.q1;

import prova01202501.ListaPassagens;
import prova01202501.TempoPassagem;

import java.util.List;

public class ListaPassagensBuilder {
    private List<TempoPassagem> tempos;
    public ListaPassagensBuilder addTempo(TempoPassagem tempo){
        this.tempos.add(tempo);
        return this;
    }
    public ListaPassagens build(){
        return new ListaPassagens(tempos);
    }
}
