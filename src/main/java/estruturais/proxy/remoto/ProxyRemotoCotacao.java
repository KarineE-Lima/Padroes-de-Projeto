package estruturais.proxy.remoto;

public class ProxyRemotoCotacao implements ServicoCotacao{
    private ServicoCotacao servicoCotacao;

    @Override
    public double getCotacaoDolar() {
        if(servicoCotacao == null){
            System.out.println("[REDE] Abrindo Socket TCP/IP na porta 8080...");
            servicoCotacao = new ServicoCotacaoRemoto();
        }
        System.out.println("[REDE] Serializando parâmetros e enviando requisição via HTTP/TCP...");
        double resultado = servicoCotacao.getCotacaoDolar();
        System.out.println("[REDE] Resposta recebida e desserializada.");
        return resultado;
    }
}
