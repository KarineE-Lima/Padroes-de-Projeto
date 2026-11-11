package estruturais.proxy.ex01;
//Real Subject
public class ServicoVideoReal implements ServicoVideo{
    @Override
    public String baixarVideo(String idVideo, String planoUsuario) {
        System.out.println("[SERVER] Baixando arquivo pesado do vídeo " + idVideo + " do storage...");
        return "CONTEUDO_BRUTO_DO_VIDEO_" + idVideo;
    }
}
