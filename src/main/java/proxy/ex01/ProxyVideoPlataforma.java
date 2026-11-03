package proxy.ex01;

import java.util.HashMap;
import java.util.Map;

//proxy
public class ProxyVideoPlataforma implements ServicoVideo{
    private ServicoVideo servicoVideo;
    private Map<String, String> cache;

    public ProxyVideoPlataforma(){
        cache = new HashMap<>();
    }

    @Override
    public String baixarVideo(String idVideo, String planoUsuario) {
        if(servicoVideo == null)
            servicoVideo = new ServicoVideoReal();
        if(idVideo.startsWith("4K_") && !planoUsuario.equals("PREMIUM"))
            throw new RuntimeException("Plano atual não dá direito a vídeos em resolução 4K!");
        String video = cache.get(idVideo);
        if (video == null) {
            video = servicoVideo.baixarVideo(idVideo, planoUsuario);
            cache.put(idVideo, video);
        }
        return video;
    }
}
