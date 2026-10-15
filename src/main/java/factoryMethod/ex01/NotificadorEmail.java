package factoryMethod.ex01;
// concrete creator
public class NotificadorEmail extends Notificador{
    @Override
    public Notificacao criarNotificacao() {
        return new EmailNotificacao();
    }
}
