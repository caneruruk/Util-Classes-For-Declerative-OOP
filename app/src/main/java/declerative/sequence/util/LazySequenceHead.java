package declerative.sequence.util;

import declerative.sequence.interfaces.Head;
import declerative.sequence.interfaces.LazySequence;

final public class LazySequenceHead<T> implements Head<T> {
    public LazySequenceHead(final LazySequence<T> lazySequence) {
        this.lazySequence = lazySequence;
    }

    @Override
    public T value() {
        return lazySequence.head();
    }

    private final LazySequence<T> lazySequence;
}
