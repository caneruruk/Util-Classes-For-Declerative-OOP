package utils.primitives;

import utils.primitives.interfaces.Double;

final public class StringAsDouble implements Double {
    public StringAsDouble(final String value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return java.lang.Double.parseDouble(value);
    }

    private final String value;
}
