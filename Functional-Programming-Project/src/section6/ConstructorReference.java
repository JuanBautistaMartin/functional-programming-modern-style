package section6;

import java.util.function.Function;

public class ConstructorReference {

    public static void main(String[] args) {

        //Function<Runnable, Thread> threadGenerator = r -> new Thread(r);
        Function<Runnable, Thread> threadGenerator = Thread::new;

        Runnable task1 = () -> System.out.println("Task one executed");
        Runnable task2 = () -> System.out.println("Task two executed");

        Thread thread1 = threadGenerator.apply(task1);
        Thread thread2 = threadGenerator.apply(task2);

        thread1.start();
        thread2.start();

        threadGenerator
                .apply(() -> System.out.print("Task three execeuted"))
                .start();

    }

}
