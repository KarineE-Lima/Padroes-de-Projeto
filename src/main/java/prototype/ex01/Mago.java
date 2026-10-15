package prototype.ex01;

public class Mago extends Personagem{
    public Mago(Personagem personagem) {
        super(personagem);
    }

    public Mago(int pontosVida, int mana) {
        super(pontosVida, mana);
    }

    @Override
    public Personagem clonar() {
        return new Mago(this);
    }

    @Override
    public void definirPosicao(double x, double y) {
        System.out.println("Mago na posição (" + x + "," + y + ") do mapa.");
    }

    @Override
    public void exibirPersonagem() {
        System.out.println("Mago: " + this);
    }
}
