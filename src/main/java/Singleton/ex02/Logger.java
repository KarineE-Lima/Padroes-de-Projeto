package Singleton.ex02;

public class Logger {
    private static volatile Logger instance;
    private int quantidadeLogs = 0;

    private Logger(){

    }

    public static Logger getInstance(){
        if(instance == null){
            synchronized (Logger.class){
                if(instance == null)
                    instance = new Logger();
            }
        }
        return instance;
    }

    public void registrarLog(String mensagem){
        synchronized(Logger.class) {
            quantidadeLogs++;
            System.out.println("[Logger n°" + quantidadeLogs +"]: " + mensagem);
        }

    }

}
