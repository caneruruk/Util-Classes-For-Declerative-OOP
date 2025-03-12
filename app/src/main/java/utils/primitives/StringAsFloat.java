package utils.primitives;

import utils.primitives.interfaces.Float;

final public class StringAsFloat implements Float {
    public StringAsFloat(final String value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return java.lang.Float.parseFloat(value);
    }

    private final String value;
}
