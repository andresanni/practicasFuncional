package ejerciciosFuncional.clasePredicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Pejercicio1 {
	public static void main(String[] args) {
		
		//Escribe una funci�n que tome un n�mero entero como 
		//entrada y devuelva true si es par, y false si es impar.
	    ArrayList<Integer> input = new ArrayList<Integer>();

		for (int i = 0; i <20; i++) {
		     input.add((int)Math.floor(Math.random() * (100 - 1 + 1) + 1));
	
		}
		
		System.out.println("----INPUT ARRAY-----");
		System.out.println(input);
		
		System.out.println("----EVEN CHECK------");
		
		Predicate<Integer> isEven = (x)->x%2==0;
		
		input.forEach((num)->{System.out.println(num+" : " +isEven.test(num));});

	}
}
