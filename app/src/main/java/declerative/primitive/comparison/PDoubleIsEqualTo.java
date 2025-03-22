package declerative.primitive.comparison;

import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PDouble;

final public class PDoubleIsEqualTo implements PBoolean {
    public PDoubleIsEqualTo(final PDouble left, final PDouble right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean boolValue() {
        return Double.compare(left.doubleValue(), right.doubleValue()) == 0;
    }

    private final PDouble left;
    private final PDouble right;
}
