package utils.primitives;

import utils.primitives.interfaces.Float;
import utils.primitives.interfaces.Long;

final public class LongAsFloat implements Float {
    public LongAsFloat(final Long value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.longValue();
    }

    private final Long value;
}
