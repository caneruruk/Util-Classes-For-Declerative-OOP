package declerative.sequence.util;

import java.util.function.Predicate;

import declerative.primitive.interfaces.PBoolean;
import declerative.sequence.interfaces.LazySequence;

final public class HasMatch<T> implements PBoolean {
    public HasMatch(final LazySequence<T> lazySequence, final Predicate<T> predicate) {
        this.lazySequence = lazySequence;
        this.predicate = predicate;
    }

    @Override
    public boolean boolValue() {
        LazySequence<T> tempLazySequence = lazySequence;
        while(tempLazySequence.hasHead()) {
            if(predicate.test(tempLazySequence.head())) {
                return true;
            }

            tempLazySequence = tempLazySequence.next();
        }

        return false;
    }

    private final LazySequence<T> lazySequence;
    private final Predicate<T> predicate;
}
