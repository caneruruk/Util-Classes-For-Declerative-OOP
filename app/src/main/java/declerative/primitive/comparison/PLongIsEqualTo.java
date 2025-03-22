package declerative.primitive.comparison;

import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PLong;

final public class PLongIsEqualTo implements PBoolean {
    public PLongIsEqualTo(final PLong left, final PLong right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean boolValue() {
        return left.longValue() == right.longValue();
    }

    private final PLong left;
    private final PLong right;
}
