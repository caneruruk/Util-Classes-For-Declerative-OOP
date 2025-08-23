package declerative.sequence.util;

import declerative.primitive.interfaces.PLong;

final public class ArrayLength<T> implements PLong {
    public ArrayLength(final T[] array) {
        this.array = array;
    }

    @Override
    public long longValue() {
        return array.length;
    }

    private final T[] array;
}
