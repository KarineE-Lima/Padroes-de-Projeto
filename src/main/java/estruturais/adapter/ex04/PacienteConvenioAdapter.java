package estruturais.adapter.ex04;
// Two-way adapter
public class PacienteConvenioAdapter implements PacienteDigital, RegistroConvenio{

    private PacienteDigital pacienteDigital;
    private RegistroConvenio registroConvenio;

    public PacienteConvenioAdapter(PacienteDigital pacienteDigital) {
        this.pacienteDigital = pacienteDigital;
    }
    public PacienteConvenioAdapter(RegistroConvenio registroConvenio){
        this.registroConvenio = registroConvenio;
    }

    @Override
    public String getCpf() {
        if(registroConvenio != null)
            return registroConvenio.getNumeroCarteirinha();
        return pacienteDigital.getCpf();
    }

    @Override
    public String getNomeCompleto() {
        if(registroConvenio != null)
            return registroConvenio.getTitular();
        return pacienteDigital.getNomeCompleto();
    }

    @Override
    public void registrarAtendimento(String descricao) {
        if (registroConvenio != null)
            registroConvenio.lancarGuiaCobranca(descricao, 0.0);
        else
            pacienteDigital.registrarAtendimento(descricao);
    }

    @Override
    public String getNumeroCarteirinha() {
        if(pacienteDigital != null)
            return pacienteDigital.getCpf();
        return registroConvenio.getNumeroCarteirinha();
    }

    @Override
    public String getTitular() {
        if (pacienteDigital != null)
            return pacienteDigital.getNomeCompleto();
        return registroConvenio.getTitular();
    }

    @Override
    public void lancarGuiaCobranca(String procedimento, double valor) {
        if(pacienteDigital != null)
            pacienteDigital.registrarAtendimento(procedimento);
        else
            registroConvenio.lancarGuiaCobranca(procedimento, valor);
    }
}
