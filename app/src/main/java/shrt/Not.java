package shrt;

final public class Not implements Interface {
    public Not(final Interface value) {
        this.value = value;
    }

    @Override
    public short value() {
        return (short)~value.value();
    }

    private final Interface value;
}
