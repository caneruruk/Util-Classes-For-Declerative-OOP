package declerative.primitive.comparison;

import declerative.primitive.arithmetic.PBooleanOr;
import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PShort;

final public class PShortIsMoreThanOrEqualTo implements PBoolean {
    public PShortIsMoreThanOrEqualTo(final PShort left, final PShort right) {
        this(new PBooleanOr(new PShortIsMoreThan(left, right), new PShortIsEqualTo(left, right)));
    }

    public PShortIsMoreThanOrEqualTo(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
