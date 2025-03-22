package declerative.primitive.comparison;

import declerative.primitive.arithmetic.PBooleanOr;
import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PDouble;

final public class PDoubleIsLessThanOrEqualTo implements PBoolean {
    public PDoubleIsLessThanOrEqualTo(final PDouble left, final PDouble right) {
        this(new PBooleanOr(new PDoubleIsLessThan(left, right), new PDoubleIsEqualTo(left, right)));
    }

    public PDoubleIsLessThanOrEqualTo(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
