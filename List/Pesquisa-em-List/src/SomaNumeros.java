import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosInteiros;

    public SomaNumeros(){
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numerosInteiros){
        this.numerosInteiros.add(numerosInteiros);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : numerosInteiros){
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numerosInteiros.isEmpty()) {
            for(Integer numero : numerosInteiros){
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numerosInteiros.isEmpty()) {
            for(Integer numero : numerosInteiros){
                if (numero <= menorNumero) {
                menorNumero = numero;
                }
            }
            return menorNumero;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public void exibirNumeros(){
        if (!numerosInteiros.isEmpty()) {
            System.out.println(this.numerosInteiros);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();
    
        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
    
        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();
    
        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());
    
        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());
    
        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
      }


}
