package prova012023.Q1;

public interface Response {
    void addHeader(String key, String value);
    void addBody(byte[] body);
    void readHeaderAndBody();
}
