package ejerciciosFuncional.claseSupplier;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Ejemplos {
    
    public static void main(String[] args) {
        
        //Generando un número aleatorio:
        Supplier<Integer> randomInteger = () -> (int) (Math.random() * 100);
        int myRandomNumber = randomInteger.get();
        System.out.println("Mi número aleatorio es: " + myRandomNumber); 
        
        //Obteniendo la fecha actual:
        Supplier<LocalDate> currentDate = () -> LocalDate.now();
        LocalDate today = currentDate.get();
        System.out.println("Hoy es: " + today);

        //Generando una cadena de texto a partir de una lista:
        List<String> myList = Arrays.asList("Hola", "mundo", "desde", "Java");
        Supplier<String> concatenatedString = () -> String.join(" ", myList);
        System.out.println(concatenatedString.get());

    }
    
    

}
