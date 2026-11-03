package proxy.inteligente;

public class App {
    public static void main(String[] args) {
        CalculadoraEstatistica calculadoraEstatistica = new ProxyInteligenteCalculadora();
        System.out.println("Fatorial de 5: " + calculadoraEstatistica.calcularFatorial(5));
        System.out.println("Fatorial de 6: " + calculadoraEstatistica.calcularFatorial(6));
        System.out.println("Fatorial de 5: " + calculadoraEstatistica.calcularFatorial(5));
    }
}
