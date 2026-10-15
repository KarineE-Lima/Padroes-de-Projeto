package builder.ex02;

import builder.ex02.step.*;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String cliente;
    private String endereco;
    private List<String> itens;
    private String formaPagamento;
    private String cupom;


    public Pedido(PedidoStepBuilder builder) {
        this.cliente = builder.cliente;
        this.cupom = builder.cupom;
        this.endereco = builder.endereco;
        this.formaPagamento = builder.formaPagamento;
        this.itens = new ArrayList<>(builder.itens);
    }

    public static class PedidoStepBuilder implements ClienteStep, EnderecoStep, ItemStep, PagamentoStep, OpcoesFinaisStep {
        private String cliente;
        private String endereco;
        private List<String> itens = new ArrayList<>();
        private String formaPagamento;
        private String cupom;


        public static ClienteStep criar(){
            return new PedidoStepBuilder();
        }

        @Override
        public EnderecoStep paraCliente(String cliente) {
            this.cliente = cliente;
            return this;
        }

        @Override
        public ItemStep entregarEm(String endereco) {
            this.endereco = endereco;
            return this;
        }

        @Override
        public ItemStep adicionarItem(String item) {
            this.itens.add(item);
            return this;
        }

        @Override
        public PagamentoStep irParaPagamento() {
            return this;
        }

        @Override
        public OpcoesFinaisStep comCupom(String cupom) {
            this.cupom = cupom;
            return this;
        }

        @Override
        public Pedido build() {
            return new Pedido(this);
        }

        @Override
        public OpcoesFinaisStep pagarCom(String formaPagamento) {
            this.formaPagamento = formaPagamento;
            return this;
        }
    }

    public void exibirResumo(){
        System.out.println("Pedido{" +
                "cliente='" + cliente + '\'' +
                ", endereco='" + endereco + '\'' +
                ", itens=" + itens +
                ", formaPagamento='" + formaPagamento + '\'' +
                ", cupom='" + cupom + '\'' +
                '}');
    }
}
