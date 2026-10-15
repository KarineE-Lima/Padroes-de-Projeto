package builder.ex02.step;

public interface ItemStep {
    ItemStep adicionarItem(String item);
    PagamentoStep irParaPagamento();
}
