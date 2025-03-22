package declerative.sequence;

import declerative.primitive.arithmetic.PLongAdd;
import declerative.primitive.choice.PBooleanChoice;
import declerative.primitive.comparison.PLongIsLessThan;
import declerative.primitive.comparison.PLongIsMoreThan;
import declerative.primitive.conversion.LongAsPLong;
import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PLong;
import declerative.sequence.interfaces.LazySequence;

final public class Range implements LazySequence<Long> {
    public Range(final PLong source, final PLong target, final PLong step) {
        this(
            new PLongAdd(source, step),
            new PBooleanChoice(
                new PLongIsMoreThan(step, new LongAsPLong(0)), 
                new PLongIsLessThan(source, target), 
                new PLongIsMoreThan(source, target)
            ),
            source,
            target,
            step
        );
    }

    public Range(final PLong nextSource, final PBoolean hasHead, final PLong head, final PLong target, final PLong step) {
        this.nextSource = nextSource;
        this.hasHead = hasHead;
        this.head = head;
        this.target = target;
        this.step = step;
    }

    @Override
    public boolean hasHead() {
        return hasHead.boolValue();
    }

    @Override
    public LazySequence<Long> next() {
        return new Range(nextSource, target, step);
    }

    @Override
    public Long head() {
        return head.longValue();
    }

    private final PLong nextSource;
    private final PBoolean hasHead;
    private final PLong head;
    private final PLong target;
    private final PLong step;
}
