package section5;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionPractice {
    public static void main(String[] args) {
        Function<String, Integer> func = s -> s.length();
        Integer length = func.apply("Basics Strong");
        System.out.println(length);

        List<String> list = List.of("Kit", "Kat", "Shake");
        List<Integer> newList = map(list, func);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> func) {
        return list.stream().map(func).collect(Collectors.toList());
    }
}
