package prova01202601;

public class ProResEncoder implements Encoder{
    private Renderer target;
    @Override
    public void intialize(Renderer target) {
        this.target = target;
    }

    @Override
    public void setUpContainer(String outputPath) {
        System.out.println("Compactando para arquivo: " + outputPath);
    }
}
