package ejerciciosFuncional.claseSupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Ejercicio2 {
    
    //Dada una lista de números enteros, encuentra el producto de todos los números de la lista.
    public static void main(String[] args) {
        
        List<Integer> input = Arrays.asList(1,2,3,4,5,6);
        Supplier<Integer> supplier = ()->{
            return input.stream().reduce(1,(x,y)->(x*y));};

            System.out.println(supplier.get());

    }
}
