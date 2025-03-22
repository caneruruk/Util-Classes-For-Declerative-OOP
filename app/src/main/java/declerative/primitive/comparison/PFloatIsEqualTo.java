package declerative.primitive.comparison;

import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PFloat;

final public class PFloatIsEqualTo implements PBoolean {
    public PFloatIsEqualTo(final PFloat left, final PFloat right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean boolValue() {
        return Float.compare(left.floatValue(), right.floatValue()) == 0;
    }

    private final PFloat left;
    private final PFloat right;
}
