package declerative.primitive.conversion;

import declerative.primitive.interfaces.PDouble;
import declerative.primitive.interfaces.PInteger;

final public class PIntegerAsPDouble implements PDouble {
    public PIntegerAsPDouble(final PInteger value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.intValue();
    }

    private final PInteger value;
}
