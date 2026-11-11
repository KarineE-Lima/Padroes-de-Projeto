package estruturais.flyweight.ex01;

import java.util.List;
// client
public class App {
    public static void main(String[] args) {
        TipoArvoreFactory factory = new TipoArvoreFactory();
        List<Arvore> arvores = List.of(
                new Arvore(factory.getTipoArvore("Pinheiro", "Verde Escuro", "textura_pinheiro.png"), 2, 5),
                new Arvore(factory.getTipoArvore("Pinheiro", "Verde Escuro", "textura_pinheiro.png"), 4, 8),
                new Arvore(factory.getTipoArvore("Pinheiro", "Branco Neve", "textura_pinheiro.png"), 9,7),
                new Arvore(factory.getTipoArvore("Carvalho", "Verde Escuro", "textura_carvalho.png"), 5, 2),
                new Arvore(factory.getTipoArvore("Carvalho", "Verde Escuro", "textura_carvalho.png"), 8, 9)
        );
        for (Arvore a: arvores){
            a.renderizar();
        }
        System.out.println("Quantidade de tipos: " + factory.getQtd());
    }
}
