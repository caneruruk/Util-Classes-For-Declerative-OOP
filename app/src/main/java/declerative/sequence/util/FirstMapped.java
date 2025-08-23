package declerative.sequence.util;

import java.util.function.Function;

import declerative.sequence.interfaces.Head;
import declerative.sequence.interfaces.LazySequence;

final public class FirstMapped<T, U> implements Head<U> {
    public FirstMapped(final LazySequence<T> lazySequence, final Function<T, U> function) {
        this.lazySequence = lazySequence;
        this.function = function;
    }

    @Override
    public U value() {
        return function.apply(lazySequence.head());
    }

    private final LazySequence<T> lazySequence;
    private final Function<T, U> function;
}
