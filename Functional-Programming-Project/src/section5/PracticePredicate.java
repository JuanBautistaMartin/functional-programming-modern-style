package section5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PracticePredicate {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Basics");
        list.add("");
        list.add("Strong");
        list.add("");
        list.add("Basics Strongs");

        Predicate<String> predicate = s -> !s.isEmpty();
        
        List<String> nonEmptyElements = filterList(list, predicate);
        System.out.println(nonEmptyElements);

        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);
        Predicate<Integer> evenPredicate = num -> num % 2 == 0;
        List<Integer> evenNumbers = filterList(intList, evenPredicate);
        System.out.println(evenNumbers);
    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }

}
