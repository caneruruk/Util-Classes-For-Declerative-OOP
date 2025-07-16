package declerative.sequence.utils;

import declerative.sequence.interfaces.RangeParameters;
import declerative.primitive.interfaces.PLong;

final public class CustomRangeParameters implements RangeParameters {
    public CustomRangeParameters(final PLong source, final PLong target, final PLong step) {
        this.source = source;
        this.target = target;
        this.step = step;
    }

    @Override
    public long source() {
        return source.longValue();
    }

    @Override
    public long target() {
        return target.longValue();
    }

    @Override
    public long step() {
        return step.longValue();
    }

    private final PLong source;
    private final PLong target;
    private final PLong step;
}