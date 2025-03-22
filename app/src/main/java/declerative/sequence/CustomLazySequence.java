package declerative.sequence;

import java.util.Arrays;

import declerative.sequence.interfaces.LazySequence;

final public class CustomLazySequence<T> implements LazySequence<T> {
    @SafeVarargs
    public CustomLazySequence(T... items) {
        this.items = items;
    }

    @Override
    public boolean hasHead() {
        return items.length > 0;
    }

    @Override
    public LazySequence<T> next() {
        return new CustomLazySequence<T>(Arrays.copyOfRange(items, 1, items.length));
    }

    @Override
    public T head() {
        return items[0];
    }

    private final T[] items;
}
