package factoryMethod.ex02;

public class ManipuladorTexto implements Manipulador{
    @Override
    public void arrastar() {
        System.out.println("[Manipulador de Texto] Exibindo caixa de edição de texto ao arrastar.");
    }
}
