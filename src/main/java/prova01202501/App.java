package prova01202501;

import prova01202501.q1.*;
import prova01202501.q2.BoletimProva;
import prova01202501.q2.ListaPassagens;
import prova01202501.q2.RegistroBoletimProva;

public class App {
    public static void main(String[] args) {
        RegistroBoletimProva registroBoletimProva = RegistroBoletimProva.instace();
        OrientacaoDirector director = new DVipNOrientacaoDirector();
        MapaBuilder mapaBuilder = new MapaBuilder();
        SinaleticaBuilder sinaleticaBuilder = new SinaleticaBuilder();
        ListaPassagensBuilder listaPassagensBuilder = new ListaPassagensBuilder();
        Mapa mapa = director.buildMapa(mapaBuilder);
        Sinaletica sinaletica = director.buildSinaletica(sinaleticaBuilder);
        ListaPassagens listaPassagens = director.buildListaPassagens(listaPassagensBuilder);
        registroBoletimProva.registrarBoletim(mapa.sexo(), mapa.idade(), mapa.dificuldade(), listaPassagens);
        BoletimProva boletimProva1 = registroBoletimProva.getBoletim(mapa.sexo(), mapa.idade(), mapa.dificuldade(), "14598");
    }
}
