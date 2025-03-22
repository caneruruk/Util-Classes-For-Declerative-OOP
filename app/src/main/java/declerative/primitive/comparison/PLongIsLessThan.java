package declerative.primitive.comparison;

import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PLong;

final public class PLongIsLessThan implements PBoolean {
    public PLongIsLessThan(final PLong left, final PLong right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean boolValue() {
        return left.longValue() < right.longValue();
    }

    private final PLong left;
    private final PLong right;
}
