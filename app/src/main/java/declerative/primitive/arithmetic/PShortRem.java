package declerative.primitive.arithmetic;

import declerative.primitive.interfaces.PShort;

final public class PShortRem implements PShort {
    public PShortRem(final PShort left, final PShort right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public short shortValue() {
        return (short)(left.shortValue() % right.shortValue());
    }

    private final PShort left;
    private final PShort right;
}
