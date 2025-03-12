package utils.primitives;

import utils.primitives.interfaces.Double;
import utils.primitives.interfaces.Integer;

final public class IntegerAsDouble implements Double {
    public IntegerAsDouble(final Integer value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.intValue();
    }

    private final Integer value;
}
