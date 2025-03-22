package declerative.primitive.conversion;

import declerative.primitive.interfaces.PDouble;
import declerative.primitive.interfaces.PFloat;

final public class PFloatAsPDouble implements PDouble {
    public PFloatAsPDouble(final PFloat value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.floatValue();
    }

    private final PFloat value;
}
