package utils.primitives;

import utils.primitives.interfaces.PInteger;

final public class PIntegerRemainder implements PInteger {
    public PIntegerRemainder(final PInteger left, final PInteger right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int intValue() {
        return left.intValue() % right.intValue();
    }

    private final PInteger left;
    private final PInteger right;
}
