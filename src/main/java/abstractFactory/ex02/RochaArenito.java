package abstractFactory.ex02;

public class RochaArenito implements ElementoTerreno{
    @Override
    public ElementoTerreno clonar() {
        return new RochaArenito();
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo Rocha Arenito.");
    }
}
