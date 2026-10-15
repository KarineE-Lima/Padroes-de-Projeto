package factoryMethod.ex01;
// concrete product
public class PushNotificacao implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("[Push] Enviando: " + mensagem);
    }
}
