package factoryMethod.ex02;

public class FiguraTexto extends Figura{
    @Override
    public Manipulador criarManipulador(){
        return new ManipuladorTexto();
    }
}
