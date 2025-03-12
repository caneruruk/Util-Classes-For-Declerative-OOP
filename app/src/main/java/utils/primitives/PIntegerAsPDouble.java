package utils.primitives;

import utils.primitives.interfaces.PDouble;
import utils.primitives.interfaces.PInteger;

final public class PIntegerAsPDouble implements PDouble {
    public PIntegerAsPDouble(final String value) {
        this(new PStringAsPInteger(value));
    }

    public PIntegerAsPDouble(final int value) {
        this(new IntegerAsPInteger(value));
    }

    public PIntegerAsPDouble(final PInteger value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.intValue();
    }

    private final PInteger value;
}
