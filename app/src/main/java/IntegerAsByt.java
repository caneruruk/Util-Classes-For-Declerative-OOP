final public class IntegerAsByt implements byt.Interface {
    public IntegerAsByt(final int value) {
        this.value = value;
    }

    @Override
    public byte value() {
        return (byte)value;
    }

    private final int value;
}
