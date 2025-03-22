package declerative.primitive.conversion;

import declerative.primitive.interfaces.PDouble;

final public class DoubleAsPDouble implements PDouble {
    public DoubleAsPDouble(final double value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return value;
    }

    private final double value;
}
