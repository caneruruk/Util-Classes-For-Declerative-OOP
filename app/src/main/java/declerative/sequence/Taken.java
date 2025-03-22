package declerative.sequence;

import declerative.primitive.arithmetic.PLongSub;
import declerative.primitive.conversion.LongAsPLong;
import declerative.primitive.interfaces.PLong;
import declerative.sequence.interfaces.LazySequence;

final public class Taken<T> implements LazySequence<T> {
    public Taken(final LazySequence<T> lazySequence, final PLong target) {
        this(lazySequence, target, new PLongSub(target, new LongAsPLong(1)));
    }

    public Taken(final LazySequence<T> lazySequence, final PLong target, final PLong nextTarget) {
        this.lazySequence = lazySequence;
        this.target = target;
        this.nextTarget = nextTarget;
    }

    @Override
    public boolean hasHead() {
        return target.longValue() > 0 && lazySequence.hasHead();
    }

    @Override
    public LazySequence<T> next() {
        return new Taken<>(lazySequence.next(), nextTarget);
    }

    @Override
    public T head() {
        return lazySequence.head();
    }

    private final LazySequence<T> lazySequence;
    private final PLong target;
    private final PLong nextTarget;
}
