package criacionais.abstractFactory.ex01.fabrica;

import criacionais.abstractFactory.ex01.botao.Botao;
import criacionais.abstractFactory.ex01.botao.BotaoDark;
import criacionais.abstractFactory.ex01.checkbox.Checkbox;
import criacionais.abstractFactory.ex01.checkbox.CheckboxDark;
import criacionais.abstractFactory.ex01.janela.Janela;
import criacionais.abstractFactory.ex01.janela.JanelaDark;

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
