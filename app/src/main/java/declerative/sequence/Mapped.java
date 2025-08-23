package declerative.sequence;

import java.util.function.Function;

import declerative.primitive.interfaces.PBoolean;
import declerative.sequence.interfaces.Head;
import declerative.sequence.interfaces.LazySequence;
import declerative.sequence.interfaces.Next;
import declerative.sequence.util.FirstMapped;
import declerative.sequence.util.HasHead;

final public class Mapped<T, U> implements LazySequence<U> {
    public Mapped(final LazySequence<T> lazySequence, final Function<T, U> function) {
        this(
            new HasHead<>(lazySequence),
            new Next<U>() {
                @Override
                public LazySequence<U> asLazySequence() {
                    return new Mapped<>(lazySequence.next(), function);
                }
            },
            new FirstMapped<T, U>(lazySequence, function)
        );
    }

    public Mapped(final PBoolean hasHead, final Next<U> next, final Head<U> head) {
        this.hasHead = hasHead;
        this.next = next;
        this.head = head;
    }

    @Override
    public boolean hasHead() {
        return hasHead.boolValue();
    }

    @Override
    public LazySequence<U> next() {
        return next.asLazySequence();
    }

    @Override
    public U head() {
        return head.value();
    }

    private final PBoolean hasHead;
    private final Next<U> next;
    private final Head<U> head;
}
