package proxy.inteligente;

import java.util.HashMap;
import java.util.Map;

public class ProxyInteligenteCalculadora implements CalculadoraEstatistica{
    private CalculadoraEstatistica calculadoraEstatistica;
    private Map<Integer, Double> cache;
    public ProxyInteligenteCalculadora(){
        cache = new HashMap<>();
    }
    @Override
    public double calcularFatorial(int numero) {
        if(calculadoraEstatistica == null)
            calculadoraEstatistica = new CalculadoraEstatisticaReal();
        var res = cache.get(numero);
        if(res == null){
            System.out.println("Número não achado");
            res = calculadoraEstatistica.calcularFatorial(numero);
            cache.put(numero, res);
        }
        return res;
    }
}
