import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> palavraMap;

    public Dicionario(){
        this.palavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavraMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!palavraMap.isEmpty()) {
            palavraMap.remove(palavra);
        }else {
            System.out.println("O dicionário está vazio.");
        }

    }

    public void exibirPalavras(){
        if(!palavraMap.isEmpty()){
            System.out.println(palavraMap);
        }else{
            System.out.println("O dicionario esta vazio");
        }
        
    }

    public String pesquisarPorPalavras(String palavra){
        String definicao = palavraMap.get(palavra);
        if (definicao != null) {
            return definicao;
        }else{
           return "Linguagem nao encontrada no dicionario" ;
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
    
        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
    
        // Exibir todas as palavras
        dicionario.exibirPalavras();
    
        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavras("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);
    
        String definicaoCSharp = dicionario.pesquisarPorPalavras("csharp");
        System.out.println(definicaoCSharp);
    
        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
      }
}
