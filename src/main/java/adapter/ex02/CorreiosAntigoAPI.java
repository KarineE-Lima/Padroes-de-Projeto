package adapter.ex02;

public class CorreiosAntigoAPI {
    private double precoBase;
    private static final double adicionalDistancia = 2;
    private static final double adicionalPeso = 1;

    public CorreiosAntigoAPI(double precoBase) {
        this.precoBase = precoBase;
    }

    public double calcularFreteAntigo(double distanciaEmKM, double pesoEmGramas){
        return precoBase +  adicionalDistancia * distanciaEmKM + adicionalPeso * pesoEmGramas;
    }
}
