package prova01202501.q1;

import prova01202501.Mapa;
import prova01202501.Sinaletica;
import prova01202501.q2.ListaPassagens;

public interface OrientacaoDirector {
    Mapa buildMapa(MapaBuilder builder);
    Sinaletica buildSinaletica(SinaleticaBuilder builder);
    ListaPassagens buildListaPassagens(ListaPassagensBuilder builder);
}
