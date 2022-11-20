package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LavaList<E> extends ArrayList<E> {

    /**
     * @param <E>
     * @return {LavaList}
     */
    public static <E> LavaList<E> of() {
        return new LavaList<>();
    }

    public static <E> LavaList<E> of(E... es) {
        LavaList<E> list = of();
        for (E e : es)
            list.add(e);
        return list;
    }

    public static <E> LavaList<E> of(ArrayList<E> list) {
        return (LavaList<E>) list;
    }

    public static <E> LavaList<E> of(List<E> list) {
        return (LavaList<E>) list;
    }

    public static <E> LavaList<E> of(Set<E> set) {
        LavaList<E> list = of();
        Iterator<E> ite = set.iterator();
        while (ite.hasNext()) {
            list.add(ite.next());
        }
        return list;
    }

    public static <E> LavaList<E> of(Stream<E> stream) {
        return of(stream.toList());
    }

    public E[] asArray() {
        final E[] es = (E[]) Array.newInstance(first().getClass(), size());
        for (int i = 0; i < size(); i++) {
            es[i] = get(i);
        }
        return es;
    }

    public Set<E> toSet() {
        return new HashSet<>(this);
    }

    public List<E> asList() {
        return (List<E>) this;
    }

    public ArrayList<E> asArrayList() {
        return (ArrayList<E>) this;
    }

    public Stream<E> asStream() {
        return Stream.of(asArray());
    }

    public LavaList<E> distinct() {
        return of(toSet());
    }

    public LavaList<E> reverse() {
        Collections.reverse(this);
        return this;
    }

    public E first() {
        return get(0);
    }

    public E last() {
        return get(size() - 1);
    }

    public LavaList<E> subList(int fromIndex, int toIndex) {
        return (LavaList<E>) super.subList(fromIndex, toIndex);
    }

    public LavaList<E> heads(int targetIndex) {
        return this.subList(0, targetIndex + 1);
    }

    public LavaList<E> tails(int backFromIndex) {
        int targetIndex = (size() - (backFromIndex + 2));
        return this.subList(targetIndex, size() - 1);
    }

    public LavaList<E> some(Predicate<E> p) {
        for (E e : this) {
            if (p.test(e))
                break;
        }
        return this;
    }

    public LavaList<E> backSome(Predicate<E> p) {
        for (int i = size() - 1; i >= 0; i--) {
            if (p.test(get(i)))
                break;
        }
        return this;
    }

    public LavaList<?> map(Function<E, ?> f) {
        return of(asStream().map(f));
    }

    public E find(Predicate<E> p) {
        for (E e : this) {
            if (p.test(e))
                return e;
        }
        return null;
    }

    public LavaList<E> removeEquals(Predicate<E>[] ps) {
        for (Predicate<E> p : ps)
            removeIf(p);
        return this;
    }

}
