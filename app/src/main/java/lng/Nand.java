package lng;

final public class Nand implements Interface {
    public Nand(final Interface left, final Interface right) {
        this(new Not(new And(left, right)));
    }

    public Nand(final Interface value) {
        this.value = value;
    }

    @Override
    public long value() {
        return value.value();
    }

    private final Interface value;
}
