package byt;

final public class Not implements Interface {
    public Not(final Interface value) {
        this.value = value;
    }

    @Override
    public byte value() {
        return (byte)~value.value();
    }

    private final Interface value;
}
