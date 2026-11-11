package prototype.ex01;

public class Habilidade {
    private String nome;
    private int nivel;

    public Habilidade(Habilidade outro) {
        this.nivel = outro.nivel;
        this.nome = outro.nome;
    }

    public Habilidade(int nivel, String nome) {
        this.nivel = nivel;
        this.nome = nome;
    }

    public Habilidade clonar(){
        return new Habilidade(this);
    }
    public void aprimorar(){
        nivel++;
    }

    @Override
    public String toString() {
        return "Habilidade{" +
                "nivel=" + nivel +
                ", nome='" + nome + '\'' +
                '}';
    }
}
