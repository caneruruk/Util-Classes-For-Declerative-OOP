package declerative.sequence;

import java.util.Arrays;

import declerative.primitive.comparison.PLongIsMoreThan;
import declerative.primitive.conversion.LongAsPLong;
import declerative.primitive.interfaces.PBoolean;
import declerative.sequence.interfaces.Head;
import declerative.sequence.interfaces.LazySequence;
import declerative.sequence.interfaces.Next;
import declerative.sequence.util.ArrayLength;
import declerative.sequence.util.FirstItemInArray;

final public class CustomLazySequence<T> implements LazySequence<T> {
    @SafeVarargs
    public CustomLazySequence(T... items) {
        this(
            new PLongIsMoreThan(
                new ArrayLength<T>(items),
                new LongAsPLong(0)
            ),
            new Next<T>() {
                @Override
                public LazySequence<T> asLazySequence() {
                    return new CustomLazySequence<T>(Arrays.copyOfRange(items, 1, items.length));
                }
            },
            new FirstItemInArray<T>(items)
        );
    }

    public CustomLazySequence(final PBoolean hasHead, final Next<T> next, final Head<T> head) {
        this.hasHead = hasHead;
        this.next = next;
        this.head = head;
    }

    @Override
    public boolean hasHead() {
        return hasHead.boolValue();
    }

    @Override
    public LazySequence<T> next() {
        return next.asLazySequence();
    }

    @Override
    public T head() {
        return head.value();
    }

    private final PBoolean hasHead;
    private final Next<T> next;
    private final Head<T> head;
}
