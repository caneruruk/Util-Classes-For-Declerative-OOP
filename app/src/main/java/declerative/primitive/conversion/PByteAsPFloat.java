package declerative.primitive.conversion;

import declerative.primitive.interfaces.PByte;
import declerative.primitive.interfaces.PFloat;

final public class PByteAsPFloat implements PFloat {
    public PByteAsPFloat(final PByte value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.byteValue();
    }

    private final PByte value;
}
