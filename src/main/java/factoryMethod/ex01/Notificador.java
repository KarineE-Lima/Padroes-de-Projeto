package factoryMethod.ex01;
// creator
public abstract class Notificador {
    // metodo construtor
    public abstract Notificacao criarNotificacao();

    public void notificarUsuario(String mensagem){
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(mensagem);
    }
}
