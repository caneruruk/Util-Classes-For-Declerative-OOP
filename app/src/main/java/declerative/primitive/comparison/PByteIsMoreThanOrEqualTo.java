package declerative.primitive.comparison;

import declerative.primitive.arithmetic.PBooleanOr;
import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PByte;

final public class PByteIsMoreThanOrEqualTo implements PBoolean {
    public PByteIsMoreThanOrEqualTo(final PByte left, final PByte right) {
        this(new PBooleanOr(new PByteIsMoreThan(left, right), new PByteIsEqualTo(left, right)));
    }

    public PByteIsMoreThanOrEqualTo(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
