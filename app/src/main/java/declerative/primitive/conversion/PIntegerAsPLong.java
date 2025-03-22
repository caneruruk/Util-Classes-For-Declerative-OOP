package declerative.primitive.conversion;

import declerative.primitive.interfaces.PInteger;
import declerative.primitive.interfaces.PLong;

final public class PIntegerAsPLong implements PLong {
    public PIntegerAsPLong(final PInteger value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return (long)value.intValue();
    }

    private final PInteger value;
}
