package ejerciciosFuncional.claseConsumer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Ejercicio5 {
    
    // Crea una función que tome un arreglo de enteros y tres objetos Consumer, 
    // y que utilice el primer Consumer para imprimir el número más grande del arreglo, 
    // el segundo Consumer para imprimir el número más pequeño del arreglo, 
    // y el tercer Consumer para imprimir la media de los números.
    public static void main(String[] args) {
        
        List<Integer> input = Arrays.asList(23,45,463,324,234,235,6,121,46);

        Consumer<List<Integer>> printMin = 
        (array)->{
            System.out.println(array.stream().min(Comparator.comparingInt(x->x)).get());            
        };

        Consumer<List<Integer>> printMax = 
        (array)->{
            System.out.println(array.stream().max(Comparator.comparingInt(x->x)).get());            
        };

        Consumer<List<Integer>> printAverage = 
        (array)->{
            System.out.println(array.stream().mapToDouble(Integer::doubleValue).average().getAsDouble());            
        };

        minMaxAndAverage(input, printMax, printMin, printAverage);


    }

    public static <T> void minMaxAndAverage(List<T>array, Consumer<List <T>> printMax,
                Consumer<List <T>> printMin,Consumer<List <T>> printAverage){

                    System.out.println("El valor minimo es: ");
                    printMin.accept(array);

                    System.out.println("El valor maximo es: ");
                    printMax.accept(array);

                    System.out.println("El promedio es: ");
                    printAverage.accept(array);
                }
}
