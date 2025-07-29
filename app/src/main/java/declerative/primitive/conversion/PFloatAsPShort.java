package declerative.primitive.conversion;

import declerative.primitive.interfaces.PFloat;
import declerative.primitive.interfaces.PShort;

final public class PFloatAsPShort implements PShort {
    public PFloatAsPShort(final PFloat value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return (short)value.floatValue();
    }

    private final PFloat value;
}
