package estruturais.facade.ex01;
// subsystem
public class EstoqueService {

    public boolean verificarEstoque(String idProduto, int qtd){
        return true;
    }
    public void reservarEstoque(String idProduto, int qtd){
        System.out.println("Estoque do produto " + idProduto + "na quantidade " + qtd + " reservado!");
    }
}
