package declerative.primitive.conversion;

import declerative.primitive.interfaces.PDouble;
import declerative.primitive.interfaces.PLong;

final public class PLongAsPDouble implements PDouble {
    public PLongAsPDouble(final PLong value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.longValue();
    }

    private final PLong value;
}
