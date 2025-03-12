package utils.primitives;

import utils.primitives.interfaces.PByte;

final public class PStringAsPByte implements PByte {
    public PStringAsPByte(final String value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return Byte.parseByte(value);
    }

    private final String value;
}
