package ejerciciosFuncional.claseFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        //Escribe una función que tome una lista de strings y devuelva una lista de
        // enteros que representen la longitud de cada string en la lista original.
        Function<String, Integer> getStringLength = (String s)-> s.length();
        List<String> input = Arrays.asList("Pepe","Juan","Alberto");
        List<Integer> output = lengths(input, getStringLength);
        System.out.println(output);
        
    }

    public static <T,R> List<R> lengths (List<T> strings, Function <T,R> function){
        List<R> output = strings.stream().map((s)->function.apply(s)).collect(Collectors.toList());        
        return output;

    }
}
