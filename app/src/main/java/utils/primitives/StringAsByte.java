package utils.primitives;

import utils.primitives.interfaces.Byte;

final public class StringAsByte implements Byte {
    public StringAsByte(final String value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return java.lang.Byte.parseByte(value);
    }

    private final String value;
}
