package utils.primitives;

import utils.primitives.interfaces.Double;
import utils.primitives.interfaces.Short;

final public class ShortAsDouble implements Double {
    public ShortAsDouble(final Short value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.shortValue();
    }

    private final Short value;
}
