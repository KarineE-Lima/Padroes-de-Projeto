package decorator.ex01;

public class App {
    private static void run(){
        Bebida meuCafe = new CafeExpresso();
        meuCafe = new Leite(meuCafe);
        meuCafe = new Chantilly(meuCafe);
        System.out.println("Descrição: "+ meuCafe.getDescricao() + "\nPreço: " + meuCafe.getPreco());
    }
    public static void main(String [] args) {
        run();
    }
}
