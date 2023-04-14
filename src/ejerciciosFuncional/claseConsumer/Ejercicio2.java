package ejerciciosFuncional.claseConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ejercicio2 {
    
    //Crea una función que tome un arreglo de cadenas y un objeto Consumer
    //y que utilice el Consumer para imprimir cada cadena en el arreglo, en mayúsculas.

    public static void main(String[] args) {
        
        List<String> input = Arrays.asList("Hola","Practicando","cOn","mI","AMIGA","chaT","gPT");
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());

        printInCapital(input, consumer);
    }
    public static <T> void printInCapital (List<T> input, Consumer<T> fun){
        input.forEach(fun);
    }
}
