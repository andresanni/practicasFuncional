package ejerciciosFuncional.claseConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ejercicio3 {
    //Crea una función que tome un arreglo de números y dos objetos Consumer,
    //y que utilice el primer Consumer para imprimir la suma de los números 
    //y el segundo Consumer para imprimir la media de los números.

    public static void main(String[] args) {
        
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,8);

        Consumer<List<Integer>> printTotal = (list) -> {
            System.out.println(list.stream().reduce(0,(a,b)->  a + b));            
        };

        Consumer<List<Integer>> printAverage = (list) -> {
            System.out.println((list.stream().mapToInt(Integer::intValue).average().getAsDouble()));            
        };
                
        printTotalAndHalf(input, printTotal, printAverage);

    }

    public static <T> void printTotalAndHalf(List<T> array, Consumer<List<T>> printTotal, Consumer<List<T>> printAverage){
        printTotal.accept(array);
        printAverage.accept(array);
    }

}
