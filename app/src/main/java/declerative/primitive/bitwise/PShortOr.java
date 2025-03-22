package declerative.primitive.bitwise;

import declerative.primitive.interfaces.PShort;

final public class PShortOr implements PShort {
    public PShortOr(final PShort left, final PShort right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public short shortValue() {
        return (short)(left.shortValue() | right.shortValue());
    }

    private final PShort left;
    private final PShort right;
}
