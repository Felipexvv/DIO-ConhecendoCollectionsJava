import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoNumeros {
    List<Integer> numeroInteiro;

    public OrdenacaoNumeros(){
        this.numeroInteiro = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeroInteiro.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numeroInteiro);
        if(!numeroInteiro.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        }else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescentende = new ArrayList<>(this.numeroInteiro);
        if(!numeroInteiro.isEmpty()){
            numerosDescentende.sort(Collections.reverseOrder());
            return numerosDescentende;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if (!numeroInteiro.isEmpty()) {
            System.out.println(this.numeroInteiro);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    
        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
    
        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
      }
}
