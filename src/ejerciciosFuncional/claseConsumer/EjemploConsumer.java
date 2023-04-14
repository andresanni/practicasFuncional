package ejerciciosFuncional.claseConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {
       
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Creamos un objeto Consumer que imprime un entero en la consola
        Consumer<Integer> imprimirEntero = (Integer entero) -> System.out.println(entero);
    
        // Utilizamos el método forEach de la lista para imprimir cada entero
        numeros.forEach(imprimirEntero);
    }
    
}
