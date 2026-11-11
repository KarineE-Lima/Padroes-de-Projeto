package prova02202401;

import java.util.HashMap;
import java.util.Map;

//Proxy: proxy
public class ProxyArquivo implements ItemSistemaArquivos{
    private Arquivo arquivo;
    private Map<String, Integer> acessos;
    public ProxyArquivo(String nome, boolean protegido, Long tamanho){
        arquivo = new Arquivo(nome, protegido, tamanho);
        acessos = new HashMap<>();
    }
    @Override
    public Long tamanho() {
        return arquivo.tamanho();
    }

    @Override
    public void ler(Credencial credencial) {
        if(arquivo.isProtegido() && credencial != null){
            arquivo.ler(credencial);
            int acesso = acessos.getOrDefault(credencial.getId(), 0);
            acessos.put(credencial.getId(), acesso+1);
            System.out.println("[LOG] Credencial " + credencial.getId() + " acessou o arquivo protegido " + arquivo.getNome() +". Total de acessos desta credencial a este arquivo: " + acessos.get(credencial));
        } else if (arquivo.isProtegido()){
            throw new RuntimeException("Acesso Negado!");
        } else {
            arquivo.ler(credencial);
        }
    }

    @Override
    public void adicionar(ItemSistemaArquivos item) {
        throw new RuntimeException("Operação não suportada!");
    }

    @Override
    public void remover(ItemSistemaArquivos item) {
        throw new RuntimeException("Operação não suportada!");
    }
}
