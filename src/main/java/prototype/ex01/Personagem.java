package prototype.ex01;

import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {

    private int pontosVida;
    private int mana;
    private List<Equipamento> equipamentos = new ArrayList<>();
    private List<Habilidade> habilidades = new ArrayList<>();

    public Personagem(int pontosVida, int mana) {
        this.pontosVida = pontosVida;
        this.mana = mana;
    }
    public Personagem(Personagem personagem){
        this.pontosVida = personagem.pontosVida;
        this.mana = personagem.mana;
    }

    public abstract Personagem clonar();

    public abstract void definirPosicao(double x, double y);
    public abstract void exibirPersonagem();
    void adicionarEquipamento(Equipamento equipamento){
        equipamentos.add(equipamento);
    }
    void adicionarHabilidade(Habilidade habilidade){
        habilidades.add(habilidade);
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "equipamentos=" + equipamentos.toString() +
                ", pontosVida=" + pontosVida +
                ", mana=" + mana +
                ", habilidades=" + habilidades.toString() +
                '}';
    }
}
