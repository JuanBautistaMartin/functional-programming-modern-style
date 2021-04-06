package section8;

import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface IConsumer<T> {

    void accept(T t);

    default IConsumer<T> thenAccept(IConsumer<T> consumer) {

        Objects.requireNonNull(consumer);

        return (T t) -> {
            this.accept(t);
            consumer.accept(t);
        };
    }

}
