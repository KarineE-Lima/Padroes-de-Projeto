package prova01202601;

public class HighPrecisionRender implements Renderer{
    private Canva target;
    @Override
    public void intialize(Canva target) {
        this.target = target;
    }

    @Override
    public void render() {
        System.out.println("Renderizando canva em High Precision: " + target.getResolution());
    }
}
