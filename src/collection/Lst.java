
package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lst<E> extends ArrayList<E> {

    /**
     * The Instance of 
     */
    private static final Lst<?> INSTANCE = new Lst<>();

    /**
     * @param <E>
     * @return
     */
    public static <E> Lst<?> of() {
        return INSTANCE;
    }

    public static <E> Lst<E> of(E... es) {
        return new Lst<E>().adds(es);
    }

    public static <E> Lst<E> of(ArrayList<E> list) {
        return new Lst<E>().addAll(list);
    }

    public static <E> Lst<E> of(Set<E> set) {
        return new Lst<E>().addCollections(set);
    }

    public static <E> Lst<E> of(Collection<E> coll) {
        return new Lst<E>().addCollections(coll);
    }

    public Lst<E> adds(E... es) {
        addAll(es);
        return this;
    }

    public Lst<E> addCollections(Collection<E> collections) {
        super.addAll(collections);
        return this;
    }

    public Lst<E> addAll(E[] es) {
        for (E n : es)
            this.add(n);
        return this;
    }

    public Lst<E> addAll(ArrayList<E> list) {
        for (E n : list)
            this.add(n);
        return this;
    }

    public List<E> toList() {
        return this;
    }

    public ArrayList<E> arrayList(){
        return this;
    }

    public Set<E> toSet() {
        return new HashSet<>(this);
    }

    public Lst<E> reverse() {
        Collections.reverse(this);
        return this;
    }

    public Lst<E> distinct() {
        return of(toSet());
    }

    public Lst<E> removeAll(E... es) {
        removeAll(of(es));
        return this;
    }

    public Lst<E> removeAll(Lst<E> iLst) {
        super.removeAll(iLst);
        return this;
    }

    public Lst<E> retainAll(Lst<E> iLst) {
        super.retainAll(iLst);
        return this;
    }

    public E getNullable(int index) {
        return size() - 1 < index ? null : get(index);
    }

    public E first() {
        return get(0);
    }

    public E firstNullable() {
        return getNullable(0);
    }

    public E last() {
        return get(size() - 1);
    }

    public E lastNullable() {
        return get(size() - 1);
    }

    public Lst<E> subList(int fromIndex, int toIndex) {
        return of(super.subList(fromIndex, toIndex));
    }

    public Lst<E> heads(int targetIndex) {
        return this.subList(0, targetIndex + 1);
    }

    public Lst<E> tails(int backFromIndex) {
        int targetIndex = (size() - (backFromIndex + 2));
        return this.subList(targetIndex, size() -1);
    }

    public Lst<E> map(Lst.IMap<E> iMap) {
        for (int i = 0; i < this.size(); i++) {
            this.set(i, iMap.each(i, this.get(i)));
        }
        return this;
    }

    public Lst<E> filter(Lst.IPredicate<E> iPre){
        for (E e: this)
            if (!iPre.match(e))
                this.remove(e);
        return this;
    }

    public Lst<E> reverseSome(Lst.IPredicate<E> iPre) {
        for (int i = size() - 1; i >= 0; i--) {
            if (!iPre.match(get(i))) {
                break;
            }
        }
        return this;
    }

    public Lst<E> some(Lst.IPredicate<E> iPre){
        for (E e : this){
            if (!iPre.match(e)){
                break;
            }
        }
        return this;
    }

    public Lst<E> forEach(Lst.IConsumer<E> iConsumer) {
        for (int i = 0; i < size(); i++) {
            iConsumer.each(i, get(i));
        }
        return this;
    }

    public E find(Lst.IPredicate<E> iPre) {
        for (E e: this)
            if (iPre.match(e))
                return e;
        return null;
    }

    public int indexOf(Lst.IPredicate<E> iPre) {
        for (int i = 0; i < size(); i++) {
            if (iPre.match(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public interface IMap<E> {
        E each(int i, E e);
    }

    public interface IPredicate<E>{
        boolean match(E e);
    }

    public interface IConsumer<E>{
        void each(int index, E e);
    }

}