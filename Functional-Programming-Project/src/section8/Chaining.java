package section8;

import java.util.function.Consumer;
import java.util.function.Function;

public class Chaining {

    public static void main(String[] args) {

        IConsumer<String> consumer1 = System.out::println;
        IConsumer<String> consumer2 = System.out::println;

        consumer1.accept("Hello");
        consumer2.accept("Hello");

        IConsumer<String> consumer3 = s -> {
            consumer1.accept(s);
            consumer2.accept(s);
        };

        consumer3.accept("Hello");

        IConsumer<String> consumer4 = consumer1.thenAccept(consumer2);
        consumer4.accept("BasicStrong");

        //IConsumer<String> consumer5 = consumer1.thenAccept(null);

        Function<Integer, Integer> f1 = i -> i+2;
        Function<Integer, Integer> f2 = i -> i*2;
        Function<Integer, Integer> f3 = f1.andThen(f2);
        System.out.println(f3.apply(10));

    }

}
