package declerative.primitive.comparison;

import declerative.primitive.arithmetic.PBooleanOr;
import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PByte;

final public class PByteIsLessThanOrEqualTo implements PBoolean {
    public PByteIsLessThanOrEqualTo(final PByte left, final PByte right) {
        this(new PBooleanOr(new PByteIsLessThan(left, right), new PByteIsEqualTo(left, right)));
    }

    public PByteIsLessThanOrEqualTo(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
