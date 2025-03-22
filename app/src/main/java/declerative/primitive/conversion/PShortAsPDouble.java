package declerative.primitive.conversion;

import declerative.primitive.interfaces.PDouble;
import declerative.primitive.interfaces.PShort;

final public class PShortAsPDouble implements PDouble {
    public PShortAsPDouble(final PShort value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.shortValue();
    }

    private final PShort value;
}
