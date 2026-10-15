package factoryMethod.ex01;
// concrete product
public class EmailNotificacao implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("[E-mail] Enviando: " + mensagem);
    }
}
