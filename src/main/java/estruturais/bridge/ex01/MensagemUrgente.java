package estruturais.bridge.ex01;
// Refined abstraction
public class MensagemUrgente extends Mensagem{
    public MensagemUrgente(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void enviar(String texto) {
        canal.enviarMensagem("URGENTE", "[ATENÇÃO] " + texto);
    }
}
