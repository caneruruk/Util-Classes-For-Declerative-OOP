package lng;

final public class Or implements Interface {
    public Or(final Interface left, final Interface right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public long value() {
        return left.value() | right.value();
    }

    private final Interface left;
    private final Interface right;
}
