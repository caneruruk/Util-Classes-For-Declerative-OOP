package declerative.primitive.conversion;

import declerative.primitive.interfaces.PByte;
import declerative.primitive.interfaces.PInteger;

final public class PIntegerAsPByte implements PByte {
    public PIntegerAsPByte(final PInteger value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return (byte)value.intValue();
    }

    private final PInteger value;
}
