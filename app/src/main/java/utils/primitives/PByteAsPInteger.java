package utils.primitives;

import utils.primitives.interfaces.PByte;
import utils.primitives.interfaces.PInteger;

final public class PByteAsPInteger implements PInteger {
    public PByteAsPInteger(final String value) {
        this(new PStringAsPByte(value));
    }

    public PByteAsPInteger(final byte value) {
        this(new ByteAsPByte(value));
    }

    public PByteAsPInteger(final PByte value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)value.byteValue();
    }

    private final PByte value;
}
