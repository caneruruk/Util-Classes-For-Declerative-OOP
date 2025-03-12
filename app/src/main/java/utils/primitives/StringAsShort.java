package utils.primitives;

import utils.primitives.interfaces.Short;

final public class StringAsShort implements Short {
    public StringAsShort(final String value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return java.lang.Short.parseShort(value);
    }

    private final String value;
}
