package declerative.primitive.conversion;

import declerative.primitive.interfaces.PByte;
import declerative.primitive.interfaces.PDouble;

final public class PDoubleAsPByte implements PByte {
    public PDoubleAsPByte(final PDouble value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return (byte)value.doubleValue();
    }

    private final PDouble value;
}
