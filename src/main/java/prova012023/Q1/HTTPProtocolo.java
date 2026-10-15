package prova012023.Q1;

public class HTTPProtocolo extends Protocolo{
    public HTTPProtocolo(String host, Integer porta) {
        super(host, porta);
    }

    @Override
    public void open() {
        System.out.println("Abrindo protocolo HTTP.");
    }

    @Override
    public void message(Request request, Response response) {
        System.out.println("Enviando mensagem HTTP...");
        request.readHeaderAndBody();
        response.readHeaderAndBody();
    }

    @Override
    public void close() {
        System.out.println("Fechando protocolo HTTP.");
    }
}
