package builder.ex01;

public class App {
    public static void main(String[] args) {
        PizzaDirector pizzaiolo = new PizzaDirector();
        Pizza pizzaMarguerita = pizzaiolo.prepararMarguerita(new Pizza.PizzaBuilder());
        pizzaMarguerita.exibirPedido();
        Pizza pizzaCalabresa = pizzaiolo.prepararCalabresa(new Pizza.PizzaBuilder());
        pizzaCalabresa.exibirPedido();
    }
}
