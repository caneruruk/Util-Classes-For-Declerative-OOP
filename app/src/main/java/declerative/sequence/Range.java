package declerative.sequence;

import declerative.primitive.arithmetic.PLongAdd;
import declerative.primitive.choice.PBooleanChoice;
import declerative.primitive.comparison.PLongIsLessThan;
import declerative.primitive.comparison.PLongIsMoreThan;
import declerative.primitive.conversion.LongAsPLong;
import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PLong;
import declerative.sequence.interfaces.LazySequence;
import declerative.sequence.interfaces.RangeParameters;
import declerative.sequence.utils.CustomRangeParameters;

final public class Range implements LazySequence<Long> {
    public Range(final PLong source, final PLong target, final PLong step) {
        this(
            new PBooleanChoice(
                new PLongIsMoreThan(step, new LongAsPLong(0)), 
                new PLongIsLessThan(source, target), 
                new PLongIsMoreThan(source, target)
            ),
            source,
            new CustomRangeParameters(new PLongAdd(source, step), target, step)
        );
    }

    public Range(final PBoolean hasHead, final PLong head, final nextParameters) {
        this.hasHead = hasHead;
        this.head = head;
        this.nextParameters = nextParameters;
    }

    @Override
    public boolean hasHead() {
        return hasHead.boolValue();
    }

    @Override
    public LazySequence<Long> next() {
        return new Range(nextParameters.source(), nextParameters.target(), nextParameters.step());
    }

    @Override
    public Long head() {
        return head.longValue();
    }

    private final PBoolean hasHead;
    private final PLong head;
    private final RangeParameters nextParameters;
}
