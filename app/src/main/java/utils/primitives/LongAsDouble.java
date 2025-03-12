package utils.primitives;

import utils.primitives.interfaces.Double;
import utils.primitives.interfaces.Long;

final public class LongAsDouble implements Double {
    public LongAsDouble(final Long value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.longValue();
    }

    private final Long value;
}
