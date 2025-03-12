package utils.primitives;

import utils.primitives.interfaces.Byte;
import utils.primitives.interfaces.Short;

final public class ByteAsShort implements Short {
    public ByteAsShort(final Byte value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return (short)value.byteValue();
    }

    private final Byte value;
}
