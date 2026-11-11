package estruturais.facade.ex01;
// facade
public class PedidoFacade {
    private PagamentoService pagamentoService;
    private EstoqueService estoqueService;
    private LogisticaService logisticaService;
    public PedidoFacade(){
        pagamentoService = new PagamentoService();
        estoqueService = new EstoqueService();
        logisticaService = new LogisticaService();
    }
    boolean finalizarPedido(String idCliente, String idProduto, int qtd, double valor){
        if(!estoqueService.verificarEstoque(idProduto, qtd))
            return false;
        if (!pagamentoService.processarPagamento(idCliente, valor))
            return false;
        estoqueService.reservarEstoque(idProduto, qtd);
        System.out.println(logisticaService.gerarEnvio(idCliente, idProduto));
        return true;
    }
}
