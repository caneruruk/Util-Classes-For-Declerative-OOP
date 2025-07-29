package declerative.primitive.conversion;

import declerative.primitive.interfaces.PByte;
import declerative.primitive.interfaces.PFloat;

final public class PFloatAsPByte implements PByte {
    public PFloatAsPByte(final PFloat value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return (byte)value.floatValue();
    }

    private final PFloat value;
}
