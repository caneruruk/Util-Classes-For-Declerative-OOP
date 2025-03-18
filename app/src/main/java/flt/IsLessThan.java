package flt;

final public class IsLessThan implements bool.Interface {
    public IsLessThan(final Interface left, final Interface right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean value() {
        return Float.compare(left.value(), right.value()) < 0;
    }

    private final Interface left;
    private final Interface right;
}
