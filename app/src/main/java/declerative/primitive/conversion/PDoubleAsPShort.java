package declerative.primitive.conversion;

import declerative.primitive.interfaces.PDouble;
import declerative.primitive.interfaces.PShort;

final public class PDoubleAsPShort implements PShort {
    public PDoubleAsPShort(final PDouble value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return (short)value.doubleValue();
    }

    private final PDouble value;
}
