package declerative.sequence;

import java.util.function.Predicate;

import declerative.primitive.interfaces.PBoolean;
import declerative.sequence.interfaces.Head;
import declerative.sequence.interfaces.LazySequence;
import declerative.sequence.interfaces.Next;
import declerative.sequence.util.FirstMatch;
import declerative.sequence.util.HasMatch;

final public class Filtered<T> implements LazySequence<T> {
    public Filtered(final LazySequence<T> lazySequence, final Predicate<T> predicate) {
        this(
            new HasMatch<>(lazySequence, predicate),
            new Next<T>() {
                @Override
                public LazySequence<T> asLazySequence() {
                    LazySequence<T> tempLazySequence = lazySequence;
                    while(tempLazySequence.hasHead()) {
                        if(predicate.test(tempLazySequence.head()))
                            return new Filtered<>(tempLazySequence.next(), predicate);
                        tempLazySequence = tempLazySequence.next();
                    }

                    return new Filtered<>(lazySequence, predicate);
                }
            },
            new FirstMatch<>(lazySequence, predicate)
        );
    }

    public Filtered(final PBoolean hasHead, final Next<T> next, final Head<T> head) {
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
