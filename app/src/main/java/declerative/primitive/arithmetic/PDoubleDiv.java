package declerative.primitive.arithmetic;

import declerative.primitive.interfaces.PDouble;

final public class PDoubleDiv implements PDouble {
    public PDoubleDiv(final PDouble left, final PDouble right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double doubleValue() {
        return left.doubleValue() / right.doubleValue();
    }

    private final PDouble left;
    private final PDouble right;
}
