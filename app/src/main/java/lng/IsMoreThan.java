package lng;

final public class IsMoreThan implements bool.Interface {
    public IsMoreThan(final Interface left, final Interface right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean value() {
        return left.value() > right.value();
    }

    private final Interface left;
    private final Interface right;
}
