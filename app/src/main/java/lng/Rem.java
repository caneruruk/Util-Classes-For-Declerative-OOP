package lng;

final public class Rem implements Interface {
    public Rem(final Interface left, final Interface right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public long value() {
        return left.value() % right.value();
    }

    private final Interface left;
    private final Interface right;
}
