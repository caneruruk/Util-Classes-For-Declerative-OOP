package utils.primitives;

import utils.primitives.interfaces.PByte;

final public class ByteAsPByte implements PByte {
    public ByteAsPByte(final byte value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return value;
    }

    private final byte value;
}
