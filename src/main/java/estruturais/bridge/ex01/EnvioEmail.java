package estruturais.bridge.ex01;
// concrete implementor
public class EnvioEmail implements CanalEnvio{
    @Override
    public void enviarMensagem(String assunto, String corpo) {
        System.out.println("[EMAIL] Assunto: " + assunto + " | Corpo: " + corpo);
    }
}
