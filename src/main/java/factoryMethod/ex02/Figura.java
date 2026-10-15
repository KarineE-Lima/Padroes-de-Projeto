package factoryMethod.ex02;

public class Figura {
    public Manipulador criarManipulador(){
        return new ManipuladorPadrao();
    }
    public void aoClicarEArrastar(){
        Manipulador manipulador = criarManipulador();
        manipulador.arrastar();
    }
}
