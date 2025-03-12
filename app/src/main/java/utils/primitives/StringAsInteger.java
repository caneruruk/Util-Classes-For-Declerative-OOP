package utils.primitives;

import utils.primitives.interfaces.Integer;

final public class StringAsInteger implements Integer {
    public StringAsInteger(final String value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return java.lang.Integer.parseInt(value);
    }

    private final String value;
}
