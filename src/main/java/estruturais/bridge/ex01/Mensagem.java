package estruturais.bridge.ex01;
//Abstraction
public abstract class Mensagem {
    protected CanalEnvio canal;
    public Mensagem(CanalEnvio canal){
        this.canal = canal;
    }
    public abstract void enviar(String texto);
}
