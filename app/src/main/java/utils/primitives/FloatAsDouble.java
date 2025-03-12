package utils.primitives;

import utils.primitives.interfaces.Double;
import utils.primitives.interfaces.Float;

final public class FloatAsDouble implements Double {
    public FloatAsDouble(final Float value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.floatValue();
    }

    private final Float value;
}
