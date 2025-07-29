package declerative.primitive.conversion;

import declerative.primitive.interfaces.PDouble;
import declerative.primitive.interfaces.PFloat;

final public class PDoubleAsPFloat implements PFloat {
    public PDoubleAsPFloat(final PDouble value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.doubleValue();
    }

    private final PDouble value;
}
