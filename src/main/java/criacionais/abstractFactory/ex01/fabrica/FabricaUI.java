package criacionais.abstractFactory.ex01.fabrica;

import criacionais.abstractFactory.ex01.botao.Botao;
import criacionais.abstractFactory.ex01.checkbox.Checkbox;
import criacionais.abstractFactory.ex01.janela.Janela;

public interface FabricaUI {
    Botao criarBotao();
    Checkbox criarCheckbox();
    Janela criarJanela();
}
