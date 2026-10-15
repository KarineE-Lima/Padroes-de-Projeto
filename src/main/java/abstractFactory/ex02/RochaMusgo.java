package abstractFactory.ex02;

public class RochaMusgo implements ElementoTerreno{
    @Override
    public ElementoTerreno clonar() {
        return new RochaMusgo();
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo rocha de musgo.");
    }
}
