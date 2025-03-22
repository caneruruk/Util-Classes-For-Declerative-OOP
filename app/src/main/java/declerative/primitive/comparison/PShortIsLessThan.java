package declerative.primitive.comparison;

import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PShort;

final public class PShortIsLessThan implements PBoolean {
    public PShortIsLessThan(final PShort left, final PShort right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean boolValue() {
        return left.shortValue() < right.shortValue();
    }

    private final PShort left;
    private final PShort right;
}
