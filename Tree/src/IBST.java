public interface IBST<E> {
    boolean add(E item);
    boolean contains(E needle);
    E find(E needle);
    boolean remove(E target);
    E delete(E target);
}
