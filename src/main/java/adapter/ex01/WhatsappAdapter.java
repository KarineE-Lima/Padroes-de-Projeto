package adapter.ex01;

public class WhatsappAdapter implements Notificador{
    private WhatsappService whatsappService;

    public WhatsappAdapter(WhatsappService whatsappService) {
        this.whatsappService = whatsappService;
    }

    @Override
    public void enviar(String mensagem, String destinatario) {
        whatsappService.sendWhatsappMessage(destinatario, mensagem);
    }
}
