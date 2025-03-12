package utils.primitives;

import utils.primitives.interfaces.PLong;
import utils.primitives.interfaces.PShort;

final public class PShortAsPLong implements PLong {
    public PShortAsPLong(final PShort value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return (long)value.shortValue();
    }

    private final PShort value;
}
