package criacionais.abstractFactory.ex01.fabrica;

import criacionais.abstractFactory.ex01.botao.Botao;
import criacionais.abstractFactory.ex01.botao.BotaoLight;
import criacionais.abstractFactory.ex01.checkbox.Checkbox;
import criacionais.abstractFactory.ex01.checkbox.CheckboxLight;
import criacionais.abstractFactory.ex01.janela.Janela;
import criacionais.abstractFactory.ex01.janela.JanelaLight;

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
