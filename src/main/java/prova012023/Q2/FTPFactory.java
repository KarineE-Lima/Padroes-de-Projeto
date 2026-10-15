package prova012023.Q2;

import prova012023.Q1.*;

public class FTPFactory implements AbstractFactory{
    @Override
    public Protocolo createProtocolo(String host, Integer porta) {
        return new FTPProtocolo(host, porta);
    }

    @Override
    public Request createRequest() {
        return new FTPRequest();
    }

    @Override
    public Response createResponse() {
        return new FTPResponse();
    }
}
