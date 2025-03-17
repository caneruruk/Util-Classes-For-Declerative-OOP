package intgr;

final public class Nor implements Interface {
    public Nor(final Interface left, final Interface right) {
        this(new Not(new Or(left, right)));
    }

    public Nor(final Interface value) {
        this.value = value;
    }

    @Override
    public int value() {
        return value.value();
    }

    private final Interface value;
}
