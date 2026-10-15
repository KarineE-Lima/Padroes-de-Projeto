package abstractFactory.ex01.checkbox;

public class CheckboxLight implements Checkbox{
    @Override
    public void marcar() {
        System.out.println("Marcando checkbox no estilo claro...");
    }
}
