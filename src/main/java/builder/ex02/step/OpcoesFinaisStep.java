package builder.ex02.step;

import builder.ex02.Pedido;

public interface OpcoesFinaisStep {
    OpcoesFinaisStep comCupom(String cupom);
    Pedido build();
}
