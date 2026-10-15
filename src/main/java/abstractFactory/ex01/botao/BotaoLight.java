package abstractFactory.ex01.botao;

public class BotaoLight implements Botao{
    @Override
    public void desenhar() {
        System.out.println("Desenhando botão no estilo claro...");
    }
}
