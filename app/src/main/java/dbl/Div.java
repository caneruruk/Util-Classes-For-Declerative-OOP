package dbl;

final public class Div implements Interface {
    public Div(final Interface left, final Interface right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double value() {
        return left.value() / right.value();
    }

    private final Interface left;
    private final Interface right;
}
