package factoryMethod.ex01;
// concrete product
public class SmsNotificacao implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("[SMS] Enviando: " + mensagem);
    }
}
