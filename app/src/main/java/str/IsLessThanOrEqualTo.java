package str;

final public class IsLessThanOrEqualTo implements bool.Interface {
    public IsLessThanOrEqualTo(final Interface left, final Interface right) {
        this(new bool.Or(new IsLessThan(left, right), new IsEqualTo(left, right)));
    }

    public IsLessThanOrEqualTo(final bool.Interface value) {
        this.value = value;
    }

    @Override
    public boolean value() {
        return value.value();
    }

    private final bool.Interface value;
}
