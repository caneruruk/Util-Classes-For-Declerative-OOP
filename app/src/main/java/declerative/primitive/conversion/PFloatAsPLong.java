package declerative.primitive.conversion;

import declerative.primitive.interfaces.PFloat;
import declerative.primitive.interfaces.PLong;

final public class PFloatAsPLong implements PLong {
    public PFloatAsPLong(final PFloat value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return (long)value.floatValue();
    }

    private final PFloat value;
}
