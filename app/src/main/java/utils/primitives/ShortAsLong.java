package utils.primitives;

import utils.primitives.interfaces.Long;
import utils.primitives.interfaces.Short;

final public class ShortAsLong implements Long {
    public ShortAsLong(final Short value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return (long)value.shortValue();
    }

    private final Short value;
}
