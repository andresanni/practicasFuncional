package ejerciciosFuncional.minAndMax;

import java.util.ArrayList;
import java.util.Comparator;

public class Ejercicio2 {
    
    //Dado un array de objetos Persona (con atributos nombre y edad), 
    //encuentra la persona de mayor edad utilizando el método max() de la API Stream.
    public static void main(String[] args) {
        
        ArrayList<Persona> personas = new ArrayList<Persona>();


        for (int i = 0; i < 10; i++) {
            int random = (int)Math.floor(Math.random() * (80 - 10 + 1) + 10);
            personas.add(new Persona("Persona"+i, random));    
        }

        System.out.println(personas);
        System.out.println("La persona mas joven es :");

        Persona personaMasVieja = personas.stream().max(Persona::compareTo).get();

        System.out.println(personaMasVieja);
    


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
