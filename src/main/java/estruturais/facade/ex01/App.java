package estruturais.facade.ex01;
// client
public class App {
    public static void main(String[] args) {
        PedidoFacade pedidoFacade = new PedidoFacade();
        System.out.println(pedidoFacade.finalizarPedido("87454", "lata78", 7, 25.00));
    }
}
