package ejerciciosFuncional.claseConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        //Crea una función que tome un arreglo de enteros y un objeto Consumer, 
        //y que utilice el Consumer para imprimir cada entero en el arreglo.
        
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7);
        Consumer<Integer> consumer = (n)-> System.out.println(n);
        
        consumeAndPrint(consumer,input);       
        
    }    
    
    public static <T> void consumeAndPrint (Consumer<T> fun, List<T> array ){
        
        array.forEach(fun);
    } 
}
