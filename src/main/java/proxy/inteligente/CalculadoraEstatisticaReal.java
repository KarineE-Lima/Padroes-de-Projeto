package proxy.inteligente;

public class CalculadoraEstatisticaReal implements CalculadoraEstatistica{
    @Override
    public double calcularFatorial(int numero) {
        double res = 1;
        for (int i = 1; i <= numero; i++) {
            res *= i;
        }
        return res;
    }
}
