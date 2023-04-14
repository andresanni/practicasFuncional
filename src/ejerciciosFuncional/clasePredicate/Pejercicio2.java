package ejerciciosFuncional.clasePredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Pejercicio2 {
	
	public static void main(String[] args) {
		//Escribe una funci�n que tome una cadena de caracteres como entrada y 
		//devuelva true si es una cadena vac�a, y false si no lo es.
		
		
		Predicate<String> isEmpty = (s)-> s.length() == 0;
		
		List<String> input = Arrays.asList("asas","","2","sasasada","","pp");
		
		input.stream().forEach((s)-> System.out.println(s+" "+isEmpty.test(s)));
	}
}
