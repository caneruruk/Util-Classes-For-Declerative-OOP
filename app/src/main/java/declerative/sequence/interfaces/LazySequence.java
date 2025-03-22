package declerative.sequence.interfaces;

public interface LazySequence<T> {
    boolean hasHead();
    LazySequence<T> next();
    T head();
}
