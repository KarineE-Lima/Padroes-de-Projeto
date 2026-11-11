package estruturais.flyweight.ex01;

// extrinseco
public class Arvore {
    private int x;
    private int y;
    private TipoArvore tipoArvore;

    public Arvore(TipoArvore tipoArvore, int x, int y) {
        this.tipoArvore = tipoArvore;
        this.x = x;
        this.y = y;
    }

    public void renderizar(){
        tipoArvore.renderizar(x, y);
    }

}
