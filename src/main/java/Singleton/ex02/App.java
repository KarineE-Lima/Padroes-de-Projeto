package Singleton.ex02;

public class App {
    private static void run(){
        Thread t1 = new Thread(()-> {
            Logger.getInstance().registrarLog("Meu pastel é mais barato.");
        });
        Thread t2 = new Thread(()->{
            Logger.getInstance().registrarLog("Batatinha quando nasce espalha a rama pelo chão.");
        });
        Thread t3 = new Thread(()->{
            Logger.getInstance().registrarLog("Minha mãe disse que eu sou bonito.");
        });
        t1.start();
        t2.start();
        t3.start();
//        Logger logger = Logger.getInstance();
//        logger.registrarLog("Batata é bom");
//        logger.registrarLog("Já resolveu o bug?");
//        Logger logger1 = Logger.getInstance();
//        logger1.registrarLog("Novo log, nova cara!");
    }
    public static void main(String[] args) {
        run();
    }
}
