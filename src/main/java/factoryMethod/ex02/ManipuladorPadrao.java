package factoryMethod.ex02;

public class ManipuladorPadrao implements Manipulador{
    @Override
    public void arrastar(){
        System.out.println("[Manipulador Padrão] Movendo a figura normalmente.");
    }
}
