package prova012023.Q1;

public abstract class Protocolo {
    private Integer porta;
    private String host;
    public Protocolo(String host, Integer porta){
        this.host = host;
        this.porta = porta;
    }
    public abstract void open();
    public abstract void message(Request request, Response response);
    public abstract void close();
}
