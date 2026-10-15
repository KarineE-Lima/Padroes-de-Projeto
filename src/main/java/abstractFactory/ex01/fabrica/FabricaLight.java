package abstractFactory.ex01.fabrica;

import abstractFactory.ex01.botao.Botao;
import abstractFactory.ex01.botao.BotaoLight;
import abstractFactory.ex01.checkbox.Checkbox;
import abstractFactory.ex01.checkbox.CheckboxLight;
import abstractFactory.ex01.janela.Janela;
import abstractFactory.ex01.janela.JanelaLight;

public class FabricaLight implements FabricaUI{
    @Override
    public Botao criarBotao() {
        return new BotaoLight();
    }

    @Override
    public Checkbox criarCheckbox() {
        return new CheckboxLight();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaLight();
    }
}
