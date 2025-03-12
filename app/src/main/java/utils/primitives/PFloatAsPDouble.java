package utils.primitives;

import utils.primitives.interfaces.PDouble;
import utils.primitives.interfaces.PFloat;

final public class PFloatAsPDouble implements PDouble {
    public PFloatAsPDouble(final String value) {
        this(new PStringAsPFloat(value));
    }

    public PFloatAsPDouble(final float value) {
        this(new FloatAsPFloat(value));
    }

    public PFloatAsPDouble(final long value) {
        this(new PLongAsPFloat(value));
    }

    public PFloatAsPDouble(final int value) {
        this(new PIntegerAsPFloat(value));
    }

    public PFloatAsPDouble(final PFloat value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.floatValue();
    }

    private final PFloat value;
}
