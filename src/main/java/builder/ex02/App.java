package builder.ex02;

public class App {
    public static void run(){
        Pedido pedido = Pedido.PedidoStepBuilder.criar()
                .paraCliente("João")
                .entregarEm("Rua das Margaridas, 79, Bairro das Flores, Cidade Encantada-BA, Brasil")
                .adicionarItem("Smarthone")
                .adicionarItem("Fone de Ouvido")
                .irParaPagamento()
                .pagarCom("Cartão de Crédito")
                .comCupom("ELETRONICOS20")
                .build();
        pedido.exibirResumo();
    }
    public static void main(String[] args) {
        run();
    }
}
