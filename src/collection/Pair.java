package collection;

/**
 * @param <K> The Type of any object, can be Pair element
 * @param <V> The Type of any object, can be Pair element
 * @author Raymond Zorro
 */

public class Pair<K, V> {

    private K m_k;
    private V m_v;

    /**
     * Construct
     *
     * @param , init pair
     */
    public Pair() {
    } // do nothing

    /**
     * @param k , init generic type k value
     * @param v , init generic type v value
     */
    public Pair(K k, V v) {
        this.m_k = k;
        this.m_v = v;
    }

    /**
     * Static Method
     *
     * @param k , init generic type k value
     * @param v , init generic type v value
     */
    static public <K, V> Pair<K, V> of(K k, V v) {
        return new Pair<>(k, v);
    }

    /**
     * KV Operator
     *
     * @param k , set k to generic type
     */
    public void setK(K k) {
        this.m_k = k;
    }

    /**
     * @param v , set k to generic type
     */
    public void setV(V v) {
        this.m_v = v;
    }

    /**
     * @return k object
     */
    public K k() {
        return m_k;
    }

    /**
     * @return v object
     */
    public V v() {
        return m_v;
    }

    /**
     * @return k.toString()
     */
    public String toKString() {
        return m_k.toString();
    }

    /**
     * @return , v.toString()
     */
    public String toVString() {
        return m_v.toString();
    }

    /**
     * @return , swap k、v value
     */
    public Pair<K, V> swap() {
        return (Pair<K, V>) Pair.of(m_v, m_k);
    }

    /**
     * @return String Type Operator
     */
    public String toString() {
        return "[" + m_k + ", " + m_v + "]";
    }

    /**
     * @return to pure string
     */
    public String toPureString() {
        return m_k.toString() + m_v.toString();
    }

    /**
     * @return compare to another pair true or false
     */
    public boolean compareTo(Pair<K, V> p) {
        return p.k().equals(m_k) && p.v().equals(m_v);
    }

    public boolean equalsK(K k) {
        return k.equals(m_k) || k == m_k;
    }

    public boolean equalsV(V v) {
        return v.equals(m_v) || v == m_v;
    }

}
