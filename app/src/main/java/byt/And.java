package byt;

final public class And implements Interface {
    public And(final Interface left, final Interface right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public byte value() {
        return (byte)(left.value() & right.value());
    }

    private final Interface left;
    private final Interface right;
}
