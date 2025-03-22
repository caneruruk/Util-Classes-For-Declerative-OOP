package declerative.primitive.arithmetic;

import declerative.primitive.interfaces.PBoolean;

final public class PBooleanOr implements PBoolean {
    public PBooleanOr(final PBoolean left, final PBoolean right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean boolValue() {
        return left.boolValue() || right.boolValue();
    }

    private final PBoolean left;
    private final PBoolean right;
}
