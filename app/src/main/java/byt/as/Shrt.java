package byt.as;

final public class Shrt implements shrt.Interface {
    public Shrt(final byt.Interface value) {
        this.value = value;
    }

    @Override
    public short value() {
        return (short)value.value();
    }

    private final byt.Interface value;
}
