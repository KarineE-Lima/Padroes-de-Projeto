package prova01202501.q2;

import prova01202501.enums.Dificuldade;
import prova01202501.enums.Idade;
import prova01202501.enums.Sexo;

import java.util.HashMap;
import java.util.Map;

public class RegistroBoletimProva {

    private static RegistroBoletimProva registroBoletimProva;
    private Map<String, ListaPassagens> registros;

    public static RegistroBoletimProva instace(){
        if (registroBoletimProva == null)
            registroBoletimProva = new RegistroBoletimProva();
        return RegistroBoletimProva.registroBoletimProva;
    }

    private RegistroBoletimProva(){
        registros = new HashMap<String, ListaPassagens>();
    }

    public void registrarBoletim(Sexo sexo, Idade idade, Dificuldade dificuldade, ListaPassagens listas){
        String categoria = categoria(sexo, idade, dificuldade);
        registros.put(categoria, listas);
    }

    public BoletimProva getBoletim(Sexo sexo, Idade idade, Dificuldade dificuldade, String CBOnumero){
        String categoria = categoria(sexo,idade,dificuldade);
        ListaPassagens lista = (ListaPassagens) registros.get(categoria);
        if(lista == null){
            return null;
        }
        return new BoletimProva(CBOnumero, (ListaPassagens) lista.clone());

    }
    private String categoria(Sexo sexo, Idade idade, Dificuldade dificuldade){
        return sexo.toString() + idade.toString() + dificuldade.toString();
    }
}
