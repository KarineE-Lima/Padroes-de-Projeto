package builder.ex01;

public class PizzaDirector {
    public Pizza prepararMarguerita(Pizza.PizzaBuilder builder){
        return builder.comTamanho("Média")
                .comMassa("tradicional")
                .comMolho("Molho de tomate")
                .comQueijo("Mussarela de Búfula")
                .adicionarIngrediente("Tomate")
                .adicionarIngrediente("Manjericão")
                .build();
    }
    public Pizza prepararCalabresa(Pizza.PizzaBuilder builder){
        return builder.comTamanho("Família")
                .comMassa("tradicional")
                .comMolho("Molho de tomate")
                .comQueijo("Mussarela")
                .adicionarIngrediente("Calabresa")
                .adicionarIngrediente("Cebola")
                .adicionarIngrediente("Orégano")
                .build();
    }
}
