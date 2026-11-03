package proxy.virtual;

public class ProxyMatrizVirtual implements MatrizDados{
    private MatrizDadosReal matrizDadosReal;

    @Override
    public void exbirMatriz() {
        if(matrizDadosReal == null){
            matrizDadosReal = new MatrizDadosReal();
        }
        matrizDadosReal.exbirMatriz();
    }
}
