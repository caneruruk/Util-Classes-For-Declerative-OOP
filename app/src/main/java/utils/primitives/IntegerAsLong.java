package utils.primitives;

import utils.primitives.interfaces.Integer;
import utils.primitives.interfaces.Long;

final public class IntegerAsLong implements Long {
    public IntegerAsLong(final Integer value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return (long)value.intValue();
    }

    private final Integer value;
}
