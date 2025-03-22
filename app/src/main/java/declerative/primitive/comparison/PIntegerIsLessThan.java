package declerative.primitive.comparison;

import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PInteger;

final public class PIntegerIsLessThan implements PBoolean {
    public PIntegerIsLessThan(final PInteger left, final PInteger right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean boolValue() {
        return left.intValue() < right.intValue();
    }

    private final PInteger left;
    private final PInteger right;
}
