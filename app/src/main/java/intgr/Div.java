package intgr;

final public class Div implements Interface {
    public Div(final Interface left, final Interface right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int value() {
        return left.value() / right.value();
    }

    private final Interface left;
    private final Interface right;
}
