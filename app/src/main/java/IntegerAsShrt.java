final public class IntegerAsShrt implements shrt.Interface {
    public IntegerAsShrt(final int value) {
        this.value = value;
    }

    @Override
    public short value() {
        return (short)value;
    }

    private final int value;
}
