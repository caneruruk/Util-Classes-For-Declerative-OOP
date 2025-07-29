package declerative.primitive.conversion;

import declerative.primitive.interfaces.PInteger;
import declerative.primitive.interfaces.PLong;

final public class PLongAsPInteger implements PInteger {
    public PLongAsPInteger(final PLong value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)value.longValue();
    }

    private final PLong value;
}
