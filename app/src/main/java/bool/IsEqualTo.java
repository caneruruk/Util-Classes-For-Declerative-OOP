package bool;

final public class IsEqualTo implements Interface {
    public IsEqualTo(final Interface left, final Interface right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean value() {
        return left.value() == right.value();
    }

    private final Interface left;
    private final Interface right;
}
