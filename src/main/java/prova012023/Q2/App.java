package prova012023.Q2;

import prova012023.Q1.Protocolo;

public class App {
    public static void enviarMensagem(AbstractFactory factory, String host, Integer porta){
        Protocolo protocolo = factory.createProtocolo(host, porta);
        protocolo.open();
        protocolo.message(factory.createRequest(), factory.createResponse());
        protocolo.close();
    }
    public static void main(String[] args) {
        AbstractFactory factory = new HTTPFactory();
        enviarMensagem(factory, "http.inf011.ifba.edu.br", Integer.valueOf(21));
    }
}
