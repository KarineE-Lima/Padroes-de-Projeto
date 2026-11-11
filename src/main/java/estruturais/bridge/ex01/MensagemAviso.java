package estruturais.bridge.ex01;
//refined Abstraction
public class MensagemAviso extends Mensagem{
    public MensagemAviso(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void enviar(String texto) {
        canal.enviarMensagem("AVISO", texto);
    }
}
