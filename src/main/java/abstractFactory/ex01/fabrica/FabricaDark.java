package abstractFactory.ex01.fabrica;

import abstractFactory.ex01.botao.Botao;
import abstractFactory.ex01.botao.BotaoDark;
import abstractFactory.ex01.checkbox.Checkbox;
import abstractFactory.ex01.checkbox.CheckboxDark;
import abstractFactory.ex01.janela.Janela;
import abstractFactory.ex01.janela.JanelaDark;

public class FabricaDark implements FabricaUI{
    @Override
    public Botao criarBotao() {
        return new BotaoDark();
    }

    @Override
    public Checkbox criarCheckbox() {
        return new CheckboxDark();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaDark();
    }
}
