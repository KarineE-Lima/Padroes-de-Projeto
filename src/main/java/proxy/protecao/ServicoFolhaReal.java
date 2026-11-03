package proxy.protecao;

public class ServicoFolhaReal implements ServicoFolha{
    @Override
    public void alterarSalario(String idFuncionario, double novoSalario) {
        System.out.println("Atualizando novo salário de: " + novoSalario + " para o funcionário de id " + idFuncionario);
    }
}
