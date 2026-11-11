package criacionais.builder.ex02.step;

import criacionais.builder.ex02.Pedido;

public interface OpcoesFinaisStep {
    OpcoesFinaisStep comCupom(String cupom);
    Pedido build();
}
