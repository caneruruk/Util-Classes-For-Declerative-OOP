package declerative.primitive.conversion;

import declerative.primitive.interfaces.PByte;
import declerative.primitive.interfaces.PLong;

final public class PByteAsPLong implements PLong {
    public PByteAsPLong(final PByte value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return (long)value.byteValue();
    }

    private final PByte value;
}
