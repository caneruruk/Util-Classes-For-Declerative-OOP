package declerative.primitive.conversion;

import declerative.primitive.interfaces.PByte;
import declerative.primitive.interfaces.PDouble;

final public class PByteAsPDouble implements PDouble {
    public PByteAsPDouble(final PByte value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.byteValue();
    }

    private final PByte value;
}
