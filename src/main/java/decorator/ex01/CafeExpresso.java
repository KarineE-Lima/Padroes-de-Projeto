package decorator.ex01;

public class CafeExpresso implements Bebida{

    @Override
    public String getDescricao() {
        return "Café Expresso";
    }

    @Override
    public double getPreco() {
        return 5.0;
    }
}
