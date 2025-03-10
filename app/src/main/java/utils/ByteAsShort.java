package utils;

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
