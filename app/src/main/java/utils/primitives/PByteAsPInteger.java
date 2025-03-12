package utils.primitives;

import utils.primitives.interfaces.PByte;
import utils.primitives.interfaces.PInteger;

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
