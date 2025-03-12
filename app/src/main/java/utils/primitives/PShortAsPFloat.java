package utils.primitives;

import utils.primitives.interfaces.PFloat;
import utils.primitives.interfaces.PShort;

final public class PShortAsPFloat implements PFloat {
    public PShortAsPFloat(final String value) {
        this(new PStringAsPShort(value));
    }

    public PShortAsPFloat(final int value) {
        this(new IntegerAsPShort(value));
    }

    public PShortAsPFloat(final PShort value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.shortValue();
    }

    private final PShort value;
}
