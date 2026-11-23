package estruturais.adapter.ex04;
// target e adaptee
public interface RegistroConvenio {
    String getNumeroCarteirinha(); // O legado usa o CPF como número da carteirinha
    String getTitular();
    void lancarGuiaCobranca(String procedimento, double valor);
}
