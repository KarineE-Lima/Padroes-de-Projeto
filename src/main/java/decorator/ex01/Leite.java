package decorator.ex01;

public class Leite extends BebidaDecorator{
    public Leite(Bebida bebida){
        super(bebida);
    }
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Leite";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.0;
    }
}
