package ejerciciosGenerico.ejecricio2;

public class Calculadora <T extends Number>{
    
    
    public static <T extends Number> Number suma(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> Number resta(T a, T b){
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number> Number multiplicacion(T a, T b){
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number>Number division (T a, T b){
        return a.doubleValue() / b.doubleValue();
    }

}
