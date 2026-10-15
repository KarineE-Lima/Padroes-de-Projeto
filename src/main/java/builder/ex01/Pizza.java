package builder.ex01;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private final String tamanho;
    private final String tipoMassa;
    private final String molho;
    private final String queijo;
    private final List<String> ingredientes;
    private final boolean bordaRecheada;

    private Pizza(PizzaBuilder builder){
        this.tamanho = builder.tamanho;
        this.tipoMassa = builder.tipoMassa;
        this.molho = builder.molho;
        this.queijo = builder.queijo;
        this.ingredientes = new ArrayList<>(builder.ingredientes);
        this.bordaRecheada = builder.bordaRecheada;
    }

    public static class PizzaBuilder {
        private String tamanho;
        private String tipoMassa;
        private String molho;
        private String queijo;
        private List<String> ingredientes = new ArrayList<>();
        private boolean bordaRecheada;

        public PizzaBuilder comTamanho(String tamanho){
            this.tamanho = tamanho;
            return this;
        }
        public PizzaBuilder comMassa(String tipoMassa){
            this.tipoMassa = tipoMassa;
            return this;
        }
        public PizzaBuilder comMolho(String molho){
            this.molho = molho;
            return this;
        }
        public PizzaBuilder comQueijo(String queijo){
            this.queijo = queijo;
            return this;
        }
        public PizzaBuilder adicionarIngrediente(String ingrediente){
            this.ingredientes.add(ingrediente);
            return this;
        }
        public PizzaBuilder comBordaRecheada(){
            this.bordaRecheada = true;
            return this;
        }

        public Pizza build(){
            if (tamanho == null || tipoMassa == null)
                throw new RuntimeException("Tamanho ou massa devem ser informados!");
            return new Pizza(this);
        }

    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public String getMolho() {
        return molho;
    }

    public String getQueijo() {
        return queijo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getTipoMassa() {
        return tipoMassa;
    }


    public void exibirPedido(){
        System.out.println("Pizza{" +
                "bordaRecheada=" + bordaRecheada +
                ", tamanho='" + tamanho + '\'' +
                ", tipoMassa='" + tipoMassa + '\'' +
                ", molho='" + molho + '\'' +
                ", queijo='" + queijo + '\'' +
                ", ingredientes=" + ingredientes +
                '}');
    }
}
