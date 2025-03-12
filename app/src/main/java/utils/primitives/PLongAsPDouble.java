package utils.primitives;

import utils.primitives.interfaces.PDouble;
import utils.primitives.interfaces.PLong;

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
