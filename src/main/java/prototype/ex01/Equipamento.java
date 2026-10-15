package prototype.ex01;

public class Equipamento {
    private String nome;
    private int durabilidade;
    private int dano;

    public Equipamento(Equipamento outro){
        this.nome = outro.nome;
        this.durabilidade = outro.durabilidade;
        this.dano = outro.dano;
    }

    public Equipamento(int dano, int durabilidade, String nome) {
        this.dano = dano;
        this.durabilidade = durabilidade;
        this.nome = nome;
    }

    public Equipamento clonar(){
        return new Equipamento(this);
    }

    public void perderDurabilidade(int dano){
        if (durabilidade > 0)
            durabilidade -= dano;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "dano=" + dano +
                ", nome='" + nome + '\'' +
                ", durabilidade=" + durabilidade +
                '}';
    }
}
