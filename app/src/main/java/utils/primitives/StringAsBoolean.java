package utils.primitives;

import utils.primitives.interfaces.Boolean;

final public class StringAsBoolean implements Boolean {
    public StringAsBoolean(final String value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return java.lang.Boolean.parseBoolean(value);
    }

    private final String value;
}
