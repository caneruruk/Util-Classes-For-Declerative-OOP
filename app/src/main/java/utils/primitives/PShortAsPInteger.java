package utils.primitives;

import utils.primitives.interfaces.PInteger;
import utils.primitives.interfaces.PShort;

final public class PShortAsPInteger implements PInteger {
    public PShortAsPInteger(final PShort value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)value.shortValue();
    }

    private final PShort value;
}
