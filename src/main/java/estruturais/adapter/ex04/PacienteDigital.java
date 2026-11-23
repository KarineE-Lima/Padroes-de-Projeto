package estruturais.adapter.ex04;
//target e adaptee
public interface PacienteDigital {
    String getCpf();
    String getNomeCompleto();
    void registrarAtendimento(String descricao);
}
