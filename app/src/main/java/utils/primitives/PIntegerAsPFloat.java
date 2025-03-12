package utils.primitives;

import utils.primitives.interfaces.PFloat;
import utils.primitives.interfaces.PInteger;

final public class PIntegerAsPFloat implements PFloat {
    public PIntegerAsPFloat(final PInteger value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.intValue();
    }

    private final PInteger value;
}
