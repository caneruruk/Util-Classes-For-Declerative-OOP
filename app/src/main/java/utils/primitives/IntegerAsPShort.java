package utils.primitives;

import utils.primitives.interfaces.PShort;

final public class IntegerAsPShort implements PShort {
    public IntegerAsPShort(final int value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return (short)value;
    }

    private final int value;
}
