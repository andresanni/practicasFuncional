package ejerciciosFuncional.claseSupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Ejercicio1 {
    
    //Dado un número entero, crea una lista que contenga ese número de cadenas vacías.
    public static void main(String[] args) {
        
        int emptyStrings = 0;

        Supplier<List<String>> emptyStringSupplier = ()->{
            
            ArrayList<String> array = new ArrayList<String>();
            
            for (int i = 0; i < emptyStrings; i++) {
                array.add("");
            }

            return array;
        };



        
    }
}
