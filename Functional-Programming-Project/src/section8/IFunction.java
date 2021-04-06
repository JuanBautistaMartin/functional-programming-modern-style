package section8;

import java.util.Objects;

@FunctionalInterface
public interface IFunction<T, R> {

    R apply(T t);

    default <V> IFunction<V, R> compose(IFunction<V, T> before) {
        Objects.requireNonNull(before);

        return (V v) -> apply(before.apply(v));
    }

}
