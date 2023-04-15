package ejerciciosFuncional.integros;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        List<Empleado> empleados = Arrays.asList(
            new Empleado("Juan","Lopez","gerente", 2000),
            new Empleado("Carlos","Ramirez","analista", 1100),
            new Empleado("Alberto","Rodriguez","gerente", 2200),
            new Empleado("Ricardo","Alvarez","analista", 1200),
            new Empleado("Eusebio","Gomez Bolaños","analista", 1100)
        );

        //Predicate: para evaluar si un empleado gana más de $1000
        Predicate<Empleado> ganaMasDeMil = (e)-> e.getSalario()>1000;

        //Predicate: para evaluar si un empleado tiene el cargo de "analista"
        Predicate<Empleado> esAnalista = (e)-> e.getCargo().equals("analista");
        //Predicate: para evaluar si un empleado tiene el cargo de "gerente"
        Predicate<Empleado> esGerente = (e)-> e.getCargo().equals("gerente");
        
        //Function: para obtener el nombre completo de un empleado (nombre y apellido)
        Function<Empleado, String> nombreCompleto = 
            (e)-> "Nombre: " + e.getNombre() + "\nApellido: " + e.getApellido();

        //ToDoubleFunction: para obtener el salario de un empleado       
        ToDoubleFunction <Empleado> obtenerSalario = (e)-> e.getSalario();

        //Consumer: para imprimir el nombre completo de un empleado que gana más de $1000
        Consumer <List<Empleado>> imprimirMasDeMil = 
            (list)->{
                list.stream()
                .filter(ganaMasDeMil)
                .forEach((e)-> System.out.println(nombreCompleto.apply(e)));
            };
            
        //Consumer: para incrementar el salario de los empleados que tienen el cargo de "gerente" en un 10%
        Consumer<List<Empleado>> incrementarGerentes = 
            (list)->{
                list.stream()
                .filter(esGerente)
                .forEach((g)-> 
                            g.setSalario(g.getSalario() + (g.getSalario()* 0.1)));
            };

        //Imprimir todos los empleados que ganan más de $1000.
        imprimirMasDeMil.accept(empleados);

        //Calcular el promedio de los salarios de los empleados que tienen el cargo de "analista".
        //DoubleStream: para calcular el promedio de los salarios de los empleados que tienen el cargo de "analista"                
        double promedio = empleados.stream().filter(esAnalista).mapToDouble(obtenerSalario).average().getAsDouble();
        System.out.println("Promedio de analistas: " +  promedio);

        //Incrementar el salario de los empleados que tienen el cargo de "gerente" en un 10%.
        incrementarGerentes.accept(empleados);
        System.out.println(empleados);












    }

    public static class Empleado{

        private String nombre;
        private String apellido;
        private String cargo;
        private double salario;

        public Empleado(String n, String a, String c, double s){
            this.nombre = n ;
            this.apellido = a;
            this.cargo = c;
            this.salario = s;
        }

        public String getNombre() {
            return nombre;
        }
        public String getApellido() {
            return apellido;
        }
        public String getCargo() {
            return cargo;
        }
        public double getSalario() {
            return salario;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        public void setCargo(String cargo) {
            this.cargo = cargo;
        }
        public void setSalario(double salario) {
            this.salario = salario;
        }
        
        @Override
        public String toString() {
           
            return "Nombre: " + this.nombre+
                   "Apellido: " + this.apellido+
                   "Cargo: " + this.cargo+
                   "Salario: " + this.salario;
        }
    }
}
