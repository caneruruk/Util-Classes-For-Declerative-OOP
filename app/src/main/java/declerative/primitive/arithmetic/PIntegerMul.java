package declerative.primitive.arithmetic;

import declerative.primitive.interfaces.PInteger;

final public class PIntegerMul implements PInteger {
    public PIntegerMul(final PInteger left, final PInteger right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int intValue() {
        return left.intValue() * right.intValue();
    }

    private final PInteger left;
    private final PInteger right;
}
