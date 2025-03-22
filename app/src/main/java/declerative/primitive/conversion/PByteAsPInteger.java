package declerative.primitive.conversion;

import declerative.primitive.interfaces.PByte;
import declerative.primitive.interfaces.PInteger;

final public class PByteAsPInteger implements PInteger {
    public PByteAsPInteger(final PByte value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)value.byteValue();
    }

    private final PByte value;
}
