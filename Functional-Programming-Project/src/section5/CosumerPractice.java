package section5;

import java.util.List;
import java.util.function.Consumer;

public class CosumerPractice {
    public static void main(String[] args) {
        List<Integer> list = List.of(34, 67, 8, 23, 67, 89, 90);
        Consumer<Integer> consumer = i -> System.out.println(i);
        consumer.accept(56);

        printElements(list, consumer);
    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
        list.forEach(consumer);
    }
}
