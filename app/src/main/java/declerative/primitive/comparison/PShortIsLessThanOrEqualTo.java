package declerative.primitive.comparison;

import declerative.primitive.arithmetic.PBooleanOr;
import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PShort;

final public class PShortIsLessThanOrEqualTo implements PBoolean {
    public PShortIsLessThanOrEqualTo(final PShort left, final PShort right) {
        this(new PBooleanOr(new PShortIsLessThan(left, right), new PShortIsEqualTo(left, right)));
    }

    public PShortIsLessThanOrEqualTo(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
