package declerative.primitive.conversion;

import declerative.primitive.interfaces.PFloat;
import declerative.primitive.interfaces.PLong;

final public class PLongAsPFloat implements PFloat {
    public PLongAsPFloat(final PLong value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.longValue();
    }

    private final PLong value;
}
