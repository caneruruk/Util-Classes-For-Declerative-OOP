package utils.primitives;

import utils.primitives.interfaces.PInteger;
import utils.primitives.interfaces.PLong;

final public class PIntegerAsPLong implements PLong {
    public PIntegerAsPLong(final PInteger value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return (long)value.intValue();
    }

    private final PInteger value;
}
