package ejerciciosFuncional.claseFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Escribe una función que tome una lista de enteros 
        //y devuelva una lista de enteros que sean el doble de cada número en la lista original.

        Function<Integer,Integer> doubleOf = (x)->x*2;
        List<Integer> input = Arrays.asList(2,4,5,6,7);
        List<Integer> output = input.stream().map((x)->doubleOf.apply(x)).collect(Collectors.toList());
        
        System.out.println(output);


    }
}
