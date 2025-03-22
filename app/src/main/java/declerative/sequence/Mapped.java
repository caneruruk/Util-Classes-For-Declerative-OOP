package declerative.sequence;

import java.util.function.Function;

import declerative.sequence.interfaces.LazySequence;

final public class Mapped<T, U> implements LazySequence<U> {
    public Mapped(final LazySequence<T> lazySequence, final Function<T, U> function) {
        this.lazySequence = lazySequence;
        this.function = function;
    }

    @Override
    public boolean hasHead() {
        return lazySequence.hasHead();
    }

    @Override
    public LazySequence<U> next() {
        return new Mapped<>(lazySequence.next(), function);
    }

    @Override
    public U head() {
        return function.apply(lazySequence.head());
    }

    private final LazySequence<T> lazySequence;
    private final Function<T, U> function;
}
