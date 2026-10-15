package prova012023.Q1;

public class HTTPProtocoloFactory extends ProtocoloFactory{
    @Override
    Protocolo createProtocolo(String host, Integer porta) {
        return new HTTPProtocolo(host, porta);
    }
}
