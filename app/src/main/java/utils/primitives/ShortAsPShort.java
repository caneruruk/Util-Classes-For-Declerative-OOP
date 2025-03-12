package utils.primitives;

import utils.primitives.interfaces.PShort;

final public class ShortAsPShort implements PShort {
    public ShortAsPShort(final short value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return value;
    }

    private final short value;
}
