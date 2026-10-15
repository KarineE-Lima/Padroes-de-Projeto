package abstractFactory.ex01.fabrica;

import abstractFactory.ex01.botao.Botao;
import abstractFactory.ex01.checkbox.Checkbox;
import abstractFactory.ex01.janela.Janela;

public interface FabricaUI {
    Botao criarBotao();
    Checkbox criarCheckbox();
    Janela criarJanela();
}
