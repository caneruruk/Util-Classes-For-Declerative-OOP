package byt;

final public class IsMoreThanOrEqualTo implements bool.Interface {
    public IsMoreThanOrEqualTo(final Interface left, final Interface right) {
        this(new bool.Or(new IsMoreThan(left, right), new IsEqualTo(left, right)));
    }

    public IsMoreThanOrEqualTo(final bool.Interface value) {
        this.value = value;
    }

    @Override
    public boolean value() {
        return value.value();
    }

    private final bool.Interface value;
}
