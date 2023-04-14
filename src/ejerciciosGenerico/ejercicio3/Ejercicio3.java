package ejerciciosGenerico.ejercicio3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import java.util.stream.Collectors;

public class Ejercicio3 {
    
       
     public static void main(String[] args) {     
        
        List<Persona> input = new ArrayList<Persona>();
        Random aleatorio = new Random(System.currentTimeMillis());

        for (int i = 0; i < 10; i++) {            
            int edad = aleatorio.nextInt(60);
            input.add(new Persona(("Persona "+ i),edad));
        }
        System.out.println("----INPUT----");
        System.out.println(input);


        List<Persona> output = input.stream()
                               .filter((persona)-> (persona.getEdad())>18)
                               .sorted()
                               .collect(Collectors.toList());

        System.out.println("----OUTPUT----"); 
        System.out.println(output);
    }                               
    
    // static Comparator<Persona> comparadorMultiple= 
    // Comparator.comparing(Persona::getEdad).thenComparing(Comparator.comparing(Persona::getNombre));

    
}
