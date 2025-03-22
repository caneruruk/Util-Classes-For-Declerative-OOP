package declerative.primitive.conversion;

import declerative.primitive.interfaces.PInteger;
import declerative.primitive.interfaces.PShort;

final public class PShortAsPInteger implements PInteger {
    public PShortAsPInteger(final PShort value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)value.shortValue();
    }

    private final PShort value;
}
