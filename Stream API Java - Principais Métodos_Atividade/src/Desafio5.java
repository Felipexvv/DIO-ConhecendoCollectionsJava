import java.util.Arrays;
import java.util.List;
//import java.util.OptionalDouble;
//import java.util.stream.DoubleStream;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /* 
            DoubleStream maiorQ5 = numeros.stream()
                .mapToDouble(Integer::doubleValue)
                .filter(e -> e >5);
                
            OptionalDouble optionalDouble = maiorQ5
                .average();

            double media = optionalDouble.orElse(0);
            System.out.println(media);
        */   
        
        double mediaSemTratamento = numeros.stream()
            .mapToDouble(Integer::doubleValue)
            .average()
            .orElse(0);

        String resultado = String.format("%.2f" , mediaSemTratamento);

        System.out.println(resultado);

    }
}
