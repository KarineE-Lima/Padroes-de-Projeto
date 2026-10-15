package prova012023.Q2;

import prova012023.Q1.Protocolo;
import prova012023.Q1.Request;
import prova012023.Q1.Response;

public interface AbstractFactory {
    Protocolo createProtocolo(String host, Integer porta);
    Request createRequest();
    Response createResponse();
}
