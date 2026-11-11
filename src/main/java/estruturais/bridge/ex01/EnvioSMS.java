package estruturais.bridge.ex01;
//concrete implementor
public class EnvioSMS implements CanalEnvio{

    @Override
    public void enviarMensagem(String assunto, String corpo) {
        System.out.println("[SMS] Assunto: " + assunto + " | Corpo: " + corpo);
    }
}
