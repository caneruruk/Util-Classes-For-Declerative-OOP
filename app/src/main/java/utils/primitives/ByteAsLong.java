package utils.primitives;

import utils.primitives.interfaces.Byte;
import utils.primitives.interfaces.Long;

final public class ByteAsLong implements Long {
    public ByteAsLong(final Byte value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return (long)value.byteValue();
    }

    private final Byte value;
}
