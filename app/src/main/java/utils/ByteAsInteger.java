package utils;

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
