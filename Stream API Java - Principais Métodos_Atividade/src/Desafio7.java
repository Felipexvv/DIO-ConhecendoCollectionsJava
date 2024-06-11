import java.util.Arrays;
import java.util.List;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Stream<Integer> maiorSegundoNumero = numeros.stream()
            .filter(n -> n > n || n < n.max)
            ;
    }
}


//https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md