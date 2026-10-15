package factoryMethod.ex01;
// concrete creator
public class NotificadorPush extends Notificador{
    @Override
    public Notificacao criarNotificacao() {
        return new PushNotificacao();
    }
}
