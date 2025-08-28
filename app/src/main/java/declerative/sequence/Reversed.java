package declerative.sequence;

import declerative.primitive.interfaces.PBoolean;
import declerative.sequence.interfaces.Head;
import declerative.sequence.interfaces.LazySequence;
import declerative.sequence.interfaces.Next;
import declerative.sequence.util.Last;
import declerative.sequence.util.LazySequenceHasHead;

final public class Reversed<T> implements LazySequence<T> {
    public Reversed(final LazySequence<T> lazySequence) {
        this(
            new LazySequenceHasHead<>(lazySequence),
            new Next<>() {
                @Override
                public LazySequence<T> asLazySequence() {
                    return new Reversed<>(new Truncated<>(lazySequence));
                }
            },
            new Last<>(lazySequence)
        );
    }

    public Reversed(final PBoolean hasHead, final Next<T> next, final Head<T> head) {
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
