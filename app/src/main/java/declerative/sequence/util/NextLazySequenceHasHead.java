package declerative.sequence.util;

import declerative.primitive.interfaces.PBoolean;
import declerative.sequence.interfaces.LazySequence;

final public class NextLazySequenceHasHead<T> implements PBoolean {
    public NextLazySequenceHasHead(final LazySequence<T> lazySequence) {
        this.lazySequence = lazySequence;
    }

    @Override
    public boolean boolValue() {
        return lazySequence.next().hasHead();
    }

    private final LazySequence<T> lazySequence;
}
