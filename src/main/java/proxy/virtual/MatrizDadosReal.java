package proxy.virtual;

public class MatrizDadosReal implements MatrizDados{
    @Override
    public void exbirMatriz() {
        System.out.println("Carregando arquivo de 2GB do disco...");
    }
}
