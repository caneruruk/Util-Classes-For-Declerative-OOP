package declerative.sequence;

import java.util.function.Predicate;

import declerative.sequence.interfaces.LazySequence;

final public class Filtered<T> implements LazySequence<T> {
    public Filtered(final LazySequence<T> lazySequence, final Predicate<T> predicate) {
        this.lazySequence = lazySequence;
        this.predicate = predicate;
    }

    @Override
    public boolean hasHead() {
        LazySequence<T> tempLazySequence = lazySequence;
        while(tempLazySequence.hasHead()) {
            if(predicate.test(tempLazySequence.head()))
                return true;
            tempLazySequence = tempLazySequence.next();
        }

        return false;
    }

    @Override
    public LazySequence<T> next() {
        LazySequence<T> tempLazySequence = lazySequence;
        while(tempLazySequence.hasHead()) {
            if(predicate.test(tempLazySequence.head()))
                return new Filtered<>(tempLazySequence.next(), predicate);
            tempLazySequence = tempLazySequence.next();
        }

        return new Filtered<>(lazySequence, predicate);
    }

    @Override
    public T head() {
        LazySequence<T> tempLazySequence = lazySequence;
        while(tempLazySequence.hasHead()) {
            final T currentItem = tempLazySequence.head();
            if(predicate.test(currentItem))
                return currentItem;
            tempLazySequence = tempLazySequence.next();
        }

        return lazySequence.head();
    }

    private final LazySequence<T> lazySequence;
    private final Predicate<T> predicate;
}
