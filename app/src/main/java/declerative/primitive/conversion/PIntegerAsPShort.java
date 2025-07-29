package declerative.primitive.conversion;

import declerative.primitive.interfaces.PInteger;
import declerative.primitive.interfaces.PShort;

final public class PIntegerAsPShort implements PShort {
    public PIntegerAsPShort(final PInteger value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return (short)value.intValue();
    }

    private final PInteger value;
}
