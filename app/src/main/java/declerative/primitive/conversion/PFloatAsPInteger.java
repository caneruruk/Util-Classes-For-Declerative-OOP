package declerative.primitive.conversion;

import declerative.primitive.interfaces.PFloat;
import declerative.primitive.interfaces.PInteger;

final public class PFloatAsPInteger implements PInteger {
    public PFloatAsPInteger(final PFloat value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)value.floatValue();
    }

    private final PFloat value;
}
