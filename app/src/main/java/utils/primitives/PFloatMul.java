package utils.primitives;

import utils.primitives.interfaces.PFloat;

final public class PFloatMul implements PFloat {
    public PFloatMul(final PFloat left, final PFloat right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public float floatValue() {
        return left.floatValue() * right.floatValue();
    }

    private final PFloat left;
    private final PFloat right;
}
