package prototype.ex01;

public class Guerreiro extends Personagem{


    public Guerreiro(int mana, int pontosVida) {
        super(pontosVida, mana);
    }
    public Guerreiro(Guerreiro guerreiro){
        super(guerreiro);
    }

    @Override
    public Personagem clonar() {
        Guerreiro clone = new Guerreiro(this);
        for (Equipamento e: getEquipamentos())
            clone.adicionarEquipamento(e);
        for (Habilidade h: getHabilidades())
            clone.adicionarHabilidade(h);
        return clone;
    }

    @Override
    public void definirPosicao(double x, double y) {
        System.out.println("Guerreiro na posição (" + x + "," + y + ") do mapa.");
    }

    @Override
    public void exibirPersonagem() {
        System.out.println("Guerreiro: " + this);
    }




}
