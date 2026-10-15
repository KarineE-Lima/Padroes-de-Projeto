package factoryMethod.ex01;

import java.util.List;

public class App {
    public static void main(String[] args){
        List<Notificador> notificadores = List.of(
                new NotificadorEmail(),
                new NotificadorSms(), new NotificadorPush());
        for (Notificador notificador : notificadores){
            notificador.notificarUsuario("Eu amo Java e me odeio!");
        }
    }
}
