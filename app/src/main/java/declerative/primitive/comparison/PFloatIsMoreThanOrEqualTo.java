package declerative.primitive.comparison;

import declerative.primitive.arithmetic.PBooleanOr;
import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PFloat;

final public class PFloatIsMoreThanOrEqualTo implements PBoolean {
    public PFloatIsMoreThanOrEqualTo(final PFloat left, final PFloat right) {
        this(new PBooleanOr(new PFloatIsMoreThan(left, right), new PFloatIsEqualTo(left, right)));
    }

    public PFloatIsMoreThanOrEqualTo(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
