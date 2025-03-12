package utils;

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
