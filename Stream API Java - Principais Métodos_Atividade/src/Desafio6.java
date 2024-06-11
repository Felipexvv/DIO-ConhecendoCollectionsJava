import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> maiorQ10 = numeros.stream()
            .filter(e -> e > 10)
            .toList();
        
        if (!maiorQ10.isEmpty()) {
            System.out.println("Temos os valores: " + maiorQ10 + " Que sao maiores que 10");
        }else{
            System.out.println("Nao temos numeros maiores que 10");
        }
    }
}
