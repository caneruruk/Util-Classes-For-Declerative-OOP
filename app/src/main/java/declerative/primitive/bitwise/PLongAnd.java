package declerative.primitive.bitwise;

import declerative.primitive.interfaces.PLong;

final public class PLongAnd implements PLong {
    public PLongAnd(final PLong left, final PLong right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public long longValue() {
        return left.longValue() & right.longValue();
    }

    private final PLong left;
    private final PLong right;
}
