package ejerciciosFuncional.claseSupplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Ejercicio4 {
    
    //Dada una lista de objetos Persona (con atributos nombre y edad), encuentra la persona de menor edad.
    private static final String Supplier = null;

    public static void main(String[] args) {
        
        ArrayList<Persona> personas = new ArrayList<Persona>();

        for (int i = 0; i < 10; i++) {
            int random = (int)Math.floor(Math.random() * (80 - 10 + 1) + 10);
            personas.add(new Persona("Persona"+i, random));    
        }

        Supplier<Persona> older = ()->{
            return personas.stream().max(Persona::compareTo).get();
        };

        System.out.println(older.get());
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
