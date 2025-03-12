package utils.primitives;

import utils.primitives.interfaces.Long;

final public class StringAsLong implements Long {
    public StringAsLong(final String value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return java.lang.Long.parseLong(value);
    }

    private final String value;
}
