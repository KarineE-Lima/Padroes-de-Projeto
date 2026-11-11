package estruturais.bridge.ex01;
//client
public class App {
    public static void main(String[] args) {
        Mensagem mensagemUrgente = new MensagemUrgente(new EnvioSMS());
        Mensagem mensagemAviso = new MensagemAviso(new EnvioEmail());
        mensagemUrgente.enviar("Ataque nuclear!");
        mensagemAviso.enviar("Você recebeu um cupom de 30% de desconto pós desastre natural: DESASTRE30");
    }
}
