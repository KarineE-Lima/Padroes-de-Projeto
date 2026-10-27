package adapter.ex03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SateliteAdapter implements RastreadorTarget{
    private final ServicoSateliteAPI servicoSateliteAPI;
    public SateliteAdapter(ServicoSateliteAPI servicoSateliteAPI){
        this.servicoSateliteAPI = servicoSateliteAPI;
    }

    @Override
    public Coordenada obterLocalizacaoAtual(String placaCaminhao) {
        String coordenada = servicoSateliteAPI.requestVehicleLocation(placaCaminhao);
        /*Pattern pattern = Pattern.compile("[-+]?\\\\d+([.,]\\\\d+)?");
        Matcher matcher = pattern.matcher(coordenada);
        double lat = 0.0, lon = 0.0;
        if (matcher.find())
            lat = Double.parseDouble(matcher.group());

        if (matcher.find())
            lon = Double.parseDouble(matcher.group());*/
        String [] partes = coordenada.split("; ");
        double lat = Double.parseDouble(partes[0].replace("LAT: ", ""));
        double lon = Double.parseDouble(partes[1].replace("LON: ", ""));
        return new Coordenada(lat, lon);
    }
}
