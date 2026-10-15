package prova012023.Q2;

import prova012023.Q1.*;

public class HTTPFactory implements AbstractFactory{
    @Override
    public Protocolo createProtocolo(String host, Integer porta) {
        return new HTTPProtocolo(host, porta);
    }

    @Override
    public Request createRequest() {
        return new HTTPRequest();
    }

    @Override
    public Response createResponse() {
        return new HTTPResponse();
    }
}
