package declerative.sequence.util;

import java.util.function.BiFunction;
import declerative.primitive.interfaces.PLong;
import declerative.sequence.interfaces.LazySequence;

final public class ReducedPLong<T> implements PLong {
    public ReducedPLong(final LazySequence<T> lazySequence, final BiFunction<PLong, T, PLong> biFunction, final PLong accum) {
        this.lazySequence = lazySequence;
        this.biFunction = biFunction;
        this.accum = accum;
    }

    @Override
    public long longValue() {
        PLong tempAccum = accum;
        LazySequence<T> tempLazySequence = lazySequence;
        while(tempLazySequence.hasHead()) {
            tempAccum = biFunction.apply(tempAccum, tempLazySequence.head());
            tempLazySequence = tempLazySequence.next();
        }
        return tempAccum.longValue();
    }

    private final LazySequence<T> lazySequence;
    private final BiFunction<PLong, T, PLong> biFunction;
    private final PLong accum;
}
