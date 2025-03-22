package declerative.primitive.conversion;

import declerative.primitive.interfaces.PLong;
import declerative.primitive.interfaces.PShort;

final public class PShortAsPLong implements PLong {
    public PShortAsPLong(final PShort value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return (long)value.shortValue();
    }

    private final PShort value;
}
