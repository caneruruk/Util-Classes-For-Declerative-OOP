package declerative.primitive.bitwise;

import declerative.primitive.interfaces.PLong;

final public class PLongNot implements PLong {
    public PLongNot(final PLong value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return ~value.longValue();
    }

    private final PLong value;
}
