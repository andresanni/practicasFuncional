package ejerciciosFuncional.clasePredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Pejercicio3 {
	
	public static void main(String[] args) {
		//Escribe una funci�n que tome una lista de n�meros enteros como entrada 
		//y devuelva true si todos los n�meros son positivos, y false si no lo son.
		
		List<Integer> inputWithNegtives = Arrays.asList(-1,2,-3,4,6);
		List<Integer> inputWithoutNegtives = Arrays.asList(1,2,3,4,6);
		
		Predicate<List<Integer>> areAllPositive = 
				(list)->{
					List<Integer> negatives = 
							list.stream()
								.filter((n)-> n<0)
								.collect(Collectors.toList());
					return negatives.isEmpty();
				} ;
		
		System.out.println("With negatives: " + areAllPositive.test(inputWithNegtives));
		System.out.println("Without negatives: " + areAllPositive.test(inputWithoutNegtives));
		
		
		
	}
}	

