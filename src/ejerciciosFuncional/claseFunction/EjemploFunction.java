package ejerciciosFuncional.claseFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class EjemploFunction {
    
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, String> intToString = (Integer i) -> {
            return i.toString();
        };

        List<String> strings = map(numbers, intToString);
        System.out.println(strings); // Output: [1, 2, 3, 4, 5]
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }
}
