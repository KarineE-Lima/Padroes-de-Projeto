package factoryMethod.ex01;
// concrete creator
public class NotificadorSms extends Notificador{
    @Override
    public Notificacao criarNotificacao() {
        return new SmsNotificacao();
    }
}
