package abstractFactory.ex01.janela;

public class JanelaLight implements Janela{
    @Override
    public void abrir() {
        System.out.println("Abrindo janela no modo claro...");
    }
}
