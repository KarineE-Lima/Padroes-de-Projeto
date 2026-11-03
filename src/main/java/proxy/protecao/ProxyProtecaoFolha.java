package proxy.protecao;

public class ProxyProtecaoFolha implements ServicoFolha{
    private ServicoFolhaReal servicoFolhaReal;
    private String perfilUsuario;

    public ProxyProtecaoFolha(String perfilUsuario){
        this.perfilUsuario = perfilUsuario;
    }

    @Override
    public void alterarSalario(String idFuncionario, double novoSalario) {
        if(servicoFolhaReal == null){
            servicoFolhaReal = new ServicoFolhaReal();
        }
        if(perfilUsuario.equals("DIRETOR"))
            servicoFolhaReal.alterarSalario(idFuncionario, novoSalario);
        else
            throw new RuntimeException("ACESSO NEGADO!");
    }
}
