package utils.primitives;

import utils.primitives.interfaces.PDouble;
import utils.primitives.interfaces.PShort;

final public class PShortAsPDouble implements PDouble {
    public PShortAsPDouble(final String value) {
        this(new PStringAsPShort(value));
    }

    public PShortAsPDouble(final int value) {
        this(new IntegerAsPShort(value));
    }

    public PShortAsPDouble(final PShort value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.shortValue();
    }

    private final PShort value;
}
