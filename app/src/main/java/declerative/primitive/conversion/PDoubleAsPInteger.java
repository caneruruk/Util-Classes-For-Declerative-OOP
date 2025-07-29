package declerative.primitive.conversion;

import declerative.primitive.interfaces.PDouble;
import declerative.primitive.interfaces.PInteger;

final public class PDoubleAsPInteger implements PInteger {
    public PDoubleAsPInteger(final PDouble value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)value.doubleValue();
    }

    private final PDouble value;
}
