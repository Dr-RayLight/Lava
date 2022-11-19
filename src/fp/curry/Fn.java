package fp.curry;
import java.util.Objects;

@FunctionalInterface
public interface Fn<T, R> {

    R apply(T t);

    default <V> Fn<V, R> compose(Fn<? super V, ? extends T> before) {
        Objects.requireNonNull(before);
        return (V v) -> apply(before.apply(v));
    }

    default <V> Fn<T, V> pipe(Fn<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }

    static <T> Fn<T, T> identity() {
        return t -> t;
    }

}
