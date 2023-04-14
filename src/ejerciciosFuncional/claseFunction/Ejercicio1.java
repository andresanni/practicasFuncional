package ejerciciosFuncional.claseFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Escribe una función que tome una lista de enteros y devuelva una lista de enteros incrementados en 1.
        
        Function <Integer, Integer> incrementInOne = (Integer x)->x+1;

        List<Integer> input = Arrays.asList(1,2,3,4,5);
        List<Integer> output= input.stream().map((x)->incrementInOne.apply(x)).collect(Collectors.toList());
        
        System.out.println(output);
    }
}
