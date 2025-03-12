package utils.primitives;

import utils.primitives.interfaces.Byte;
import utils.primitives.interfaces.Double;

final public class ByteAsDouble implements Double {
    public ByteAsDouble(final Byte value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.byteValue();
    }

    private final Byte value;
}
