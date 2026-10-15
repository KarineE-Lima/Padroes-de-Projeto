package prova012023.Q1;

public class FTPProtocolo extends Protocolo{
    public FTPProtocolo(String host, Integer porta) {
        super(host, porta);
    }

    @Override
    public void open() {
        System.out.println("Abrindo protocolo FTP.");
    }

    @Override
    public void message(Request request, Response response) {
        System.out.println("Enviando mensagem FTP...");
        request.readHeaderAndBody();
        response.readHeaderAndBody();
    }

    @Override
    public void close() {
        System.out.println("Fechando protocolo FTP.");
    }
}
