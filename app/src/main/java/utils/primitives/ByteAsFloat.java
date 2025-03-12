package utils.primitives;

import utils.primitives.interfaces.Byte;
import utils.primitives.interfaces.Float;

final public class ByteAsFloat implements Float {
    public ByteAsFloat(final Byte value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.byteValue();
    }

    private final Byte value;
}
