package lng;

final public class Noxor implements Interface {
    public Noxor(final Interface left, final Interface right) {
        this(new Not(new Xor(left, right)));
    }

    public Noxor(final Interface value) {
        this.value = value;
    }

    @Override
    public long value() {
        return value.value();
    }

    private final Interface value;
}
