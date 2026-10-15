package prova012023.Q1;

public class App {
    public static void enviarMensagem(ProtocoloFactory factory, String host, Integer port, Request request, Response response){
        Protocolo protocolo = factory.createProtocolo(host, port);
        protocolo.open();
        protocolo.message(request, response);
        protocolo.close();
    }
    public static void main(String[] args) {
        ProtocoloFactory factory = new HTTPProtocoloFactory();
        enviarMensagem(factory, "http.inf011.ifba.edu.br", Integer.valueOf(21), new HTTPRequest(), new HTTPResponse());
    }
}
