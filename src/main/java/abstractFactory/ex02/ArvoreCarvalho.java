package abstractFactory.ex02;

public class ArvoreCarvalho implements ElementoTerreno{
    @Override
    public ElementoTerreno clonar() {
        return new ArvoreCarvalho();
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo árvore de Carvalho.");
    }
}
