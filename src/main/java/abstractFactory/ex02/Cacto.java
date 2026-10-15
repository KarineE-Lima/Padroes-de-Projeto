package abstractFactory.ex02;

public class Cacto implements ElementoTerreno{
    @Override
    public ElementoTerreno clonar() {
        return new Cacto();
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo Cacto.");
    }
}
