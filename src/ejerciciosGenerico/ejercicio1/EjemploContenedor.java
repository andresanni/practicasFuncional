package ejerciciosGenerico.ejercicio1;
import java.io.IOException;



public class EjemploContenedor {
    public static void main(String[] args) {
        
        Integer[] enteros = new Integer[5];
        String identificador="Pepe";


        Contenedor miContenedor = new Contenedor<Integer,String>(enteros, identificador);

        try {
            System.out.println(miContenedor.serializar().length);
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}

