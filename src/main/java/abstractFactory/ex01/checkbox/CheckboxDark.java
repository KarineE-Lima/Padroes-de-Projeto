package abstractFactory.ex01.checkbox;

public class CheckboxDark implements Checkbox{
    @Override
    public void marcar() {
        System.out.println("Marcando checkbox no estilo escuro...");
    }
}
