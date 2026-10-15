package prova012023.Q1;

import java.util.Map;

public class FTPRequest implements Request{
    private Map<String, String> header;
    private byte[] body;

    @Override
    public void addHeader(String key, String value) {
        header.put(key, value);
    }

    @Override
    public void addBody(byte[] body) {
        this.body = body;
    }

    @Override
    public void readHeaderAndBody() {
        System.out.println("FTP Request: ");
        System.out.println("Header:{\n" + header.toString()+ "\n}");
        System.out.println("Body:\n" + body + "\n}");

    }
}
