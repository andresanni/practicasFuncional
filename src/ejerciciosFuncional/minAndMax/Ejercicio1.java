package ejerciciosFuncional.minAndMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ejercicio1 {
    private static final int Comparator = 0;

    public static void main(String[] args) {
        //Dado un array de enteros, encuentra el número mínimo utilizando el método min() de la API Stream. 
        List<Integer> input = Arrays.asList(23,45,463,324,234,235,6,121,46);

        int min = input.stream().mapToInt(Integer::intValue).min().getAsInt();
        //int min = input.stream().mapToInt((i)->i.intValue()).min().getAsInt();

        System.out.println("El minimo es : " + min);       

    }
}
