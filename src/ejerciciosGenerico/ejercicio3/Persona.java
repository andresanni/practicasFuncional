package ejerciciosGenerico.ejercicio3;

public class Persona implements Comparable<Persona>{
    
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre=nombre;
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
        
        return "Nombre: " + nombre + "\n"+"Edad: " + edad + " \n"+"---\n";
        
    }

    @Override
    public int compareTo(Persona  p) {
        if(this.edad>p.getEdad())
        {
            return -1;
        }
        else if(this.edad==p.getEdad())
            {
                return this.nombre.compareTo(p.nombre);
            }
            else return 1;
    }



}
