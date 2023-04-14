package ejerciciosFuncional.claseFunction;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        // Escribe una función que tome una lista de objetos y una función que transforme cada 
        //objeto en un valor numérico. 
        //La función debe devolver la suma de los valores numéricos transformados.
        
        
		//Escribe una función que tome una lista de objetos y una función que transforme cada objeto en un valor numérico. 
		//La función debe devolver la suma de los valores numéricos transformados.
		
		Function<List<Object>, List<Integer>> lengthsOfStrings = 
        (listOfObjects)->{
            List<Integer> output = 
                    listOfObjects.stream()
                    .filter((object)-> object instanceof String )
                    .map((object)->Integer.valueOf(object.toString()))
                    .collect(Collectors.toList());
            return output;					
            
        };	



    }
}
