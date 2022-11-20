package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Pairs<K, V> extends LavaList<Pair<K, V>> {

    public Pairs() {
    }

    public Pairs<K, V> removeK(K k) {
        removeIf(p -> p.equalsK(k));
        return this;
    }

    public Pairs<K, V> removeV(V v) {
        removeIf(p -> p.equalsV(v));
        return this;
    }

    public K[] arrayK() {
        return toKList().asArray();
    }

    public LavaList<K> toKList() {
        return (LavaList<K>) map(p -> p.k());
    }

    public V[] arrayV() {
        return toVList().asArray();
    }

    public LavaList<V> toVList() {
        return (LavaList<V>) map(p -> p.v());
    }

    public Pairs<V, K> swap() {
        return (Pairs<V, K>) map(p -> p.swap());
    }

    public Map<K, V> asMap() {
        Map<K, V> map = new HashMap<>();
        forEach(p -> map.put(p.k(), p.v()));
        return map;
    }

    public Map<V, K> asVKMap() {
        Map<V, K> map = new HashMap<>();
        forEach(p -> map.put(p.v(), p.k()));
        return map;
    }

    public Hashtable<K, V> asTable() {
        Hashtable<K, V> table = new Hashtable<>();
        forEach(p -> table.put(p.k(), p.v()));
        return table;
    }

    public Hashtable<V, K> asVKTable() {
        Hashtable<V, K> table = new Hashtable<>();
        forEach(p -> table.put(p.v(), p.k()));
        return table;
    }
}
