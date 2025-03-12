package utils.primitives;

import utils.primitives.interfaces.PByte;

final public class IntegerAsPByte implements PByte {
    public IntegerAsPByte(final int value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return (byte)value;
    }

    private final int value;
}
