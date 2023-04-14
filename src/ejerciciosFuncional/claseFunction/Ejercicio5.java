package ejerciciosFuncional.claseFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		
		//Escribe una funci�n que tome una lista de strings 
		//y devuelva una lista de los strings que contengan solo caracteres alfab�ticos.
		//Por ejemplo, si la lista de entrada es ["Hola", "1234", "Adi�s", "A1B2C3"], 
		//la lista de salida ser�a ["Hola", "Adi�s"].			
		
		Function <List<String>,List<String>> checkAlphabetic = 
				(inputList)->{			
				return  inputList.stream()
						.filter((object)->{
							return 
							object instanceof String
							&& !object.matches(".*\\d.*");
						})
						.collect(Collectors.toList());
				};
				
		List<String> input = Arrays.asList("Hola", "1234", "Adi�s", "A1B2C3");
		
		List<String> output = checkAlphabetic.apply(input);
				
		System.out.println(output);
	}
	
	
}
