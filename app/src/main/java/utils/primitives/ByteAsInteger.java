package utils.primitives;

import utils.primitives.interfaces.Byte;
import utils.primitives.interfaces.Integer;

final public class ByteAsInteger implements Integer {
    public ByteAsInteger(final Byte value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)value.byteValue();
    }

    private final Byte value;
}
