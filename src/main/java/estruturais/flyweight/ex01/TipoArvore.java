package estruturais.flyweight.ex01;
// flyweight
public class TipoArvore {
    private String nome;
    private String cor;
    private String textura;

    public TipoArvore(String nome, String cor, String textura) {
        this.cor = cor;
        this.nome = nome;
        this.textura = textura;
    }

    public void renderizar(int x, int y){
        System.out.println("[RENDERIZANDO] Árvore " + nome + " (" + cor + ") na posição (" + x + ", " + y + ")." );
    }
}
