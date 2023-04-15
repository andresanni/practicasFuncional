package ejerciciosFuncional.integros;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ejercicio1 {
    
    // En este ejemplo, se tiene una lista de objetos Persona, cada uno con un nombre y una edad. 
    // Se desea imprimir los nombres de las personas que cumplen con cierta 
    // condición de edad (en este caso, ser mayores de edad). Para esto, se utiliza un predicado
    // que evalúa si una persona es mayor de edad, una función que toma una persona y devuelve su nombre, 
    // un consumidor que imprime el nombre de una persona, y un proveedor que devuelve la lista de personas.
    public static void main(String[] args) {
        
        List<Persona> input = Arrays.asList(
            new Persona("Juan",12),
            new Persona("Alejo",19),
            new Persona("David",22),
            new Persona("Laura",30),
            new Persona("Pedro",72),
            new Persona("Pedro",10)
        );

        Supplier<List<Persona>> getList = ()-> input;
        Predicate<Persona> isAdult = (p) ->  p.getEdad()>18;
        Function <Persona, String> personName = (p) -> p.getNombre();
        Consumer <String> printName = (n) -> System.out.println(n);



        getList.get().stream().filter(isAdult).forEach(p ->printName.accept(personName.apply(p)));



    }
    public static class Persona implements Comparable<Persona>{
        
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad){
            this.nombre = nombre;
            this.edad = edad;
        }
        
        public int getEdad() {
            return edad;
        }
        public String getNombre() {
            return nombre;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }        
       
        @Override
        public String toString() {
            return"Nombre: " + nombre+ " Edad: "+ edad+"\n";            
        }
        @Override
        public int compareTo(Persona p) {
           if(p.getEdad()<this.edad) return 1;
           else return -1;
            
        }
    }
}
