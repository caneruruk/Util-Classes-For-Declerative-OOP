package utils.primitives;

import utils.primitives.interfaces.PFloat;
import utils.primitives.interfaces.PLong;

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
