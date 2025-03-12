package utils.primitives;

import utils.primitives.interfaces.PByte;
import utils.primitives.interfaces.PShort;

final public class PByteAsPShort implements PShort {
    public PByteAsPShort(final PByte value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return (short)value.byteValue();
    }

    private final PByte value;
}
