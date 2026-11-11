package prototype.ex01;

public class App {
    public static void main(String[] args) {
        RegistroPersonagens registro = new RegistroPersonagens();
        Guerreiro guerreiroElite = new Guerreiro(12, 20);
        guerreiroElite.adicionarEquipamento(new Equipamento(5, 100,"Espada Longa"));
        guerreiroElite.adicionarEquipamento(new Equipamento(0, 104, "Escudo de Aço"));
        registro.registrarPersonagem("GUERREIRO_ELITE", guerreiroElite);
        Personagem novoGuerreiro = registro.clonar("GUERREIRO_ELITE");
        novoGuerreiro.adicionarEquipamento(new Equipamento(1, 1,"Escudo de folha"));
        guerreiroElite.exibirPersonagem();
        novoGuerreiro.exibirPersonagem();
    }
}
