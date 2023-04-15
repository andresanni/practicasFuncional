package ejerciciosFuncional.claseSupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Ejercicio3 {

    //Dada una lista de cadenas, encuentra la cadena más larga
    public static void main(String[] args) {

        List<String> input = Arrays.asList("Hola","Practicando","cOn","mI","AMIGA","chaT","gPT");

        Supplier<String> longest = ()->{
            
            return input.stream().max(String::compareToIgnoreCase).get();
        };

        System.out.println(longest.get());

    }
}
