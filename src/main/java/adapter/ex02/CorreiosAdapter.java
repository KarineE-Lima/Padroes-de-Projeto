package adapter.ex02;

public class CorreiosAdapter extends CorreiosAntigoAPI implements CalculadoraFrete{
    public CorreiosAdapter(double precoBase) {
        super(precoBase);
    }

    @Override
    public double calcular(double peso, double distancia) {
        distancia /= 1000; // supondo que esteja em m
        peso *= 1000; // supondo que esteja em kg
        return calcularFreteAntigo(distancia, peso);
    }
}
