package declerative.sequence;

import declerative.primitive.arithmetic.PLongAdd;
import declerative.primitive.choice.PBooleanChoice;
import declerative.primitive.comparison.PLongIsLessThan;
import declerative.primitive.comparison.PLongIsMoreThan;
import declerative.primitive.conversion.LongAsPLong;
import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PLong;
import declerative.sequence.interfaces.Head;
import declerative.sequence.interfaces.LazySequence;
import declerative.sequence.interfaces.Next;

final public class Range implements LazySequence<Long> {
    public Range(final PLong source, final PLong target, final PLong step) {
        this(
            new PBooleanChoice(
                new PLongIsMoreThan(step, new LongAsPLong(0)), 
                new PLongIsLessThan(source, target), 
                new PLongIsMoreThan(source, target)
            ),
            new Next<Long>() {
                @Override
                public LazySequence<Long> asLazySequence() {
                    return new Range(new PLongAdd(source, step), target, step);
                }
            },
            new Head<Long>() {
                public Long value() {
                    return source.longValue();
                }
            }
        );
    }

    public Range(final PBoolean hasHead, final Next<Long> next, final Head<Long> head) {
        this.hasHead = hasHead;
        this.next = next;
        this.head = head;
    }

    @Override
    public boolean hasHead() {
        return hasHead.boolValue();
    }

    @Override
    public LazySequence<Long> next() {
        return next.asLazySequence();
    }

    @Override
    public Long head() {
        return head.value();
    }

    private final PBoolean hasHead;
    private final Next<Long> next;
    private final Head<Long> head;
}
