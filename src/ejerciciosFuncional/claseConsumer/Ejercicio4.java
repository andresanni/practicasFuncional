package ejerciciosFuncional.claseConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ejercicio4 {
//     Crea una función que tome una lista de objetos y dos objetos Consumer, 
//     y que utilice el primer Consumer para imprimir todos los objetos que sean instancias de una clase específica, 
//     y el segundo Consumer para imprimir todos los objetos que no sean instancias de esa clase.
    public static void main(String[] args) {

        List<Object> input = Arrays.asList("Hola",new Person(), "Practicando",123,new Animal(),"AMIGA","chaT","gPT");

        Consumer <Object> printInsances = (s)->{
            System.out.println(s + " _ Is an instance");
         };
        
         Consumer <Object> printNoInsances = (s)->{
            System.out.println(s + " _ Is not an instance");
         };

         System.out.println("Calling function with Animal.class");
         printWeatherIntsancesOf(input, Animal.class, printInsances,printNoInsances);

         System.out.println("Calling function with Person.class:");
         printWeatherIntsancesOf(input, Person.class, printInsances,printNoInsances);


    }



    public static <T>  void printWeatherIntsancesOf (List<T> list, Class<?> clazz,
        Consumer<T> printInstances,Consumer<T> printNoInstances){

            list.stream().forEach((o)->{ 
                    if(clazz.isInstance(o)){
                        printInstances.accept(o);
                    }
                    else printNoInstances.accept(o);
            });
    }

    private static class Animal{
        @Override
        public String toString() {
            
            return "Animalito";
        }
    }

    private static class Person{
        @Override
        public String toString() {
            
            return "Personita";
        }
    }


}


