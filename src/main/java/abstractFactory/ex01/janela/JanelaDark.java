package abstractFactory.ex01.janela;

public class JanelaDark implements Janela{
    @Override
    public void abrir() {
        System.out.println("Abrindo janela no modo escuro...");
    }
}
