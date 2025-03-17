package flt;

final public class Add implements Interface {
    public Add(final Interface left, final Interface right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public float value() {
        return left.value() + right.value();
    }

    private final Interface left;
    private final Interface right;
}
