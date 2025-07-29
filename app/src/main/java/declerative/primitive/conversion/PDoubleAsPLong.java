package declerative.primitive.conversion;

import declerative.primitive.interfaces.PDouble;
import declerative.primitive.interfaces.PLong;

final public class PDoubleAsPLong implements PLong {
    public PDoubleAsPLong(final PDouble value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return (long)value.doubleValue();
    }

    private final PDouble value;
}
