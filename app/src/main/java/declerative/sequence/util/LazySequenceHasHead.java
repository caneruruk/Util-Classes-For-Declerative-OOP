package declerative.sequence.util;

import declerative.primitive.interfaces.PBoolean;
import declerative.sequence.interfaces.LazySequence;

final public class LazySequenceHasHead<T> implements PBoolean {
    public LazySequenceHasHead(final LazySequence<T> lazySequence) {
        this.lazySequence = lazySequence;
    }

    @Override
    public boolean boolValue() {
        return lazySequence.hasHead();
    }

    private final LazySequence<T> lazySequence;
}
