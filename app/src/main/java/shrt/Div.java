package shrt;

final public class Div implements Interface {
    public Div(final Interface left, final Interface right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public short value() {
        return (short)(left.value() / right.value());
    }

    private final Interface left;
    private final Interface right;
}
