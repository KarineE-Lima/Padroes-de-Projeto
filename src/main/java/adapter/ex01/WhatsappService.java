package adapter.ex01;

public class WhatsappService {

    public void sendWhatsappMessage(String phone, String text){
        System.out.println("Enviando mensagem para o telefone: " + phone + ". Mensagem: " + text);
    }
}
