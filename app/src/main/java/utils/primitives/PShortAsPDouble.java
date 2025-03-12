package utils.primitives;

import utils.primitives.interfaces.PDouble;
import utils.primitives.interfaces.PShort;

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
