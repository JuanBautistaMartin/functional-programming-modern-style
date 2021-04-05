package section5;

import java.util.function.BiFunction;

public class BiFunctionPractice {
    public static void main(String[] args) {

        BiFunction<String, String, String> biFunction = (a, b) -> a + b;

        String result = biFunction.apply("Basics", "String");
        System.out.println(result);

        BiFunction<String, String, Integer> biFunction1 = (a, b) -> (a + b).length();

        Integer lenght = biFunction1.apply("Basics", "String");
        System.out.println(lenght);

    }

}
