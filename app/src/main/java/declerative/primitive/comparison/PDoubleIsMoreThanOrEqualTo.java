package declerative.primitive.comparison;

import declerative.primitive.arithmetic.PBooleanOr;
import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PDouble;

final public class PDoubleIsMoreThanOrEqualTo implements PBoolean {
    public PDoubleIsMoreThanOrEqualTo(final PDouble left, final PDouble right) {
        this(new PBooleanOr(new PDoubleIsMoreThan(left, right), new PDoubleIsEqualTo(left, right)));
    }

    public PDoubleIsMoreThanOrEqualTo(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
