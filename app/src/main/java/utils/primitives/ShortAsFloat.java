package utils.primitives;

import utils.primitives.interfaces.Float;
import utils.primitives.interfaces.Short;

final public class ShortAsFloat implements Float {
    public ShortAsFloat(final Short value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.shortValue();
    }

    private final Short value;
}
