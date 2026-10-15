package abstractFactory.ex01;

import abstractFactory.ex01.botao.Botao;
import abstractFactory.ex01.checkbox.Checkbox;
import abstractFactory.ex01.fabrica.FabricaDark;
import abstractFactory.ex01.fabrica.FabricaLight;
import abstractFactory.ex01.fabrica.FabricaUI;

public class Cliente {
    public static void main(String[] args) {
        FabricaUI fabrica = new FabricaLight();
        Botao botao1 = fabrica.criarBotao();
        Checkbox checkbox1 = fabrica.criarCheckbox();
        botao1.desenhar();
        checkbox1.marcar();
    }
}
