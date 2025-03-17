package utils.primitives;

import utils.primitives.interfaces.PShort;

final public class PShortRemainder implements PShort {
    public PShortRemainder(final PShort left, final PShort right) {
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
