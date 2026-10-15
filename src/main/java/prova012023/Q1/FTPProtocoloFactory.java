package prova012023.Q1;

public class FTPProtocoloFactory extends ProtocoloFactory{
    @Override
    public Protocolo createProtocolo(String host, Integer porta) {
        return new FTPProtocolo(host, porta);
    }
}
